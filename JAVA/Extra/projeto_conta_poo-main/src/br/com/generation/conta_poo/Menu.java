package br.com.generation.conta_poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.generation.conta_poo.model.Conta;
import br.com.generation.conta_poo.model.ContaCorrente;
import br.com.generation.conta_poo.model.ContaInss;
import br.com.generation.conta_poo.util.Cores;

public class Menu {

	private static Scanner ler = new Scanner(System.in);
	private static ArrayList<Conta> listconta = new ArrayList<Conta>();
	
	public static void main(String[] args){
		
		int opcao = 0;
		int posicao = 0;
		int posicao_favorecido = 0;
		
		int numero, numeroDeposito, beneficio = 0;
		String titular, agencia;
		float saldo, limite, valor = 0.0f;
		
		ContaCorrente cc1 = new ContaCorrente(123456, "123", "CC", "Jo�o da Silva", 2000.0f, 100.0f);
		listconta.add(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(123457, "123", "CC", "Manuela da Silva", 1500.0f, 100.0f);
		listconta.add(cc2);
		
		ContaInss ci1 = new ContaInss(123458, "123", "CI", "Jo�o da Silva", 2000.0f, 1234567890);
		listconta.add(ci1);
		
		while(true) {

				System.out.println(Cores.TEXT_GREEN + "*********************************************************************" 
													+ Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND 
													+ "                                                                     ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND
													+ "                       BANCO GENERATION BRASIL                       ");
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND 
													+ "                                                                     ");
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_GREEN
													+ "*********************************************************************");
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLUE_BACKGROUND
													+ "                                                                     ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            1 - Criar Conta Corrente                                 ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            2 - Criar Conta INSS                                     ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            3 - Dados da Conta                                       ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            4 - Sacar                                                ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            5 - Depositar em Conta Corrente                          ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            6 - Transferir entre Contas Corrente                     ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "            7 - Sair                                                 ");
				System.out.println(Cores.TEXT_GREEN_BOLD + "                                                                     " 
													+ Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_GREEN + "*********************************************************************");
				System.out.println(Cores.TEXT_YELLOW + " Entre com a op��o desejada:                         "
													+ Cores.TEXT_RESET);
				opcao = ler.nextInt();
				
				if (opcao == 7) {
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Generation Brasil - O seu Futuro come�a aqui!");
					ler.close();
					System.exit(0);
				}
				
				switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta Corrente\n\n");
					
					System.out.println("Digite o Numero da Ag�ncia: ");
					agencia = ler.next();
					System.out.println("Digite o Nome do Titular: ");
					titular = ler.next();
					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = ler.nextFloat();
					System.out.println("Digite o Limite da Conta (R$): ");
					limite = ler.nextFloat();
					
					numero = geraNumeroConta();
					
					listconta.add(new ContaCorrente(numero, agencia, "CC", titular, saldo, limite));
					
					System.out.println(Cores.TEXT_GREEN + "Conta Corrente Criada com Sucesso!\n\n" + Cores.TEXT_RESET);
					
					posicao = buscaConta(numero);
					listconta.get(posicao).visualiza();
					keyPress();
					
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta INSS\n\n");
					
					System.out.println("Digite o Numero da Ag�ncia: ");
					agencia = ler.next();
					System.out.println("Digite o Nome do Titular: ");
					titular = ler.next();
					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = ler.nextFloat();
					System.out.println("Digite o Numero do Benef�cio: ");
					beneficio = ler.nextInt();
					
					numero = geraNumeroConta();
					
					listconta.add(new ContaCorrente(numero, agencia, "CI", titular, saldo, beneficio));
					
					System.out.println(Cores.TEXT_GREEN + "Conta Corrente Criada com Sucesso!\n\n" + Cores.TEXT_RESET);
					
					posicao = buscaConta(numero);
					listconta.get(posicao).visualiza();
					keyPress();
					
					break;
				case 3:
					
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = ler.nextInt();
					
					posicao = buscaConta(numero);
					
					if (posicao != -1) {
						listconta.get(posicao).visualiza();
						keyPress();
					}else {
						System.out.println(Cores.TEXT_RED_BOLD + "Conta Inv�lida!\n\n");
						keyPress();
					}
	
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = ler.nextInt();
					System.out.println("Digite o Valor do Saque (R$): ");
					valor = ler.nextFloat();
					
					posicao = buscaConta(numero);
					
					if (posicao != -1) {
						if(listconta.get(posicao).saque(valor) == true) {
							System.out.println(Cores.TEXT_GREEN_BOLD + "Saldo: " + listconta.get(posicao).getSaldo());
							keyPress();
						}else
							System.out.println(Cores.TEXT_RED_BOLD + "Saldo Insuficiente!\n\n");
					}else {
						System.out.println(Cores.TEXT_RED_BOLD + "Conta Inv�lida!\n\n");
						keyPress();
					}					
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
					
					System.out.println("Digite o Numero da conta: ");
					numero = ler.nextInt();
					System.out.println("Digite o Valor do Dep�sito (R$): ");
					valor = ler.nextFloat();
					
					posicao = buscaConta(numero);
					
					if (posicao != -1 && listconta.get(posicao) instanceof ContaCorrente) {
						if( ((ContaCorrente) listconta.get(posicao)).deposito(valor) == true) {
							System.out.println(Cores.TEXT_GREEN_BOLD + "Saldo ap�s o Dep�sito: " + listconta.get(posicao).getSaldo());
							keyPress();
						}else {
							System.out.println(Cores.TEXT_RED_BOLD + "Saldo Insuficiente!\n\n");
							keyPress();
						}
					}else {
						System.out.println(Cores.TEXT_RED_BOLD + "Conta Inv�lida!\n\n");
						keyPress();
					}
					break;
				case 6:
					
					System.out.println(Cores.TEXT_WHITE + "Transfer�ncia entre Contas\n\n");
					
					System.out.println("Digite o Numero da Conta de Origem: ");
					numero = ler.nextInt();
					System.out.println("Digite o Numero da Conta de Destino: ");
					numeroDeposito = ler.nextInt();
					System.out.println("Digite o Valor da Transfer�ncia (R$): ");
					valor = ler.nextFloat();
					
					posicao = buscaConta(numero);
					posicao_favorecido = buscaConta(numeroDeposito);
					
					if (posicao != -1 && listconta.get(posicao) instanceof ContaCorrente
							&& posicao_favorecido != -1 && listconta.get(posicao) instanceof ContaCorrente) {
						
						if( ((ContaCorrente) listconta.get(posicao)).transferencia(valor, ((ContaCorrente) listconta.get(posicao_favorecido))) == true) {
							System.out.println(Cores.TEXT_GREEN_BOLD + "Transfer�ncia de: " + valor + " para a Conta: " + numero + " Conclu�da com Sucesso!\n");
							System.out.println(Cores.TEXT_GREEN_BOLD + "Saldo atual ap�s a Transfer�ncia: " + listconta.get(posicao).getSaldo() + "\n\n");
						}else
							System.out.println(Cores.TEXT_RED_BOLD + "Saldo Insuficiente!\n\n");
						
					}else
						System.out.println(Cores.TEXT_RED_BOLD + "Conta Inv�lida!\n\n");
					
					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOp��o Inv�lida!");
					break;
			}
				
		} 
		
	}
	
	public static int buscaConta(int numero) {
		
		int posicao = -1;
		
		for (int contador = 0; contador < listconta.size(); contador++) {
			
			if (((Conta) listconta.get(contador)).getNumero() == numero)
				return posicao = contador;
			
		}
		
		return posicao;
		
	}
	
	public static int geraNumeroConta() {
		
		if (listconta.isEmpty())		
			return 11111;

			int ultimoNumero = listconta.get(listconta.size() - 1).getNumero();
			return ultimoNumero + 1;
		
	}
	
	public static void keyPress() {
		
		try {
			
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
}
