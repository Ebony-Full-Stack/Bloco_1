package vetor2;

/*
Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da 
constante deve ser armazenado na própria matriz.

Autor: Leonardo Alves
*/

import java.util.Scanner;

public class exe_04 {
	public static void main(String[] args) throws InterruptedException {
		
		double [][] matriz01 = new double[2][2];
		double [][] matriz02 = new double[2][2];
		Scanner entrada = new Scanner(System.in);
		int opcao, l, c;	
		
		for (int linha=0; linha<2; linha++) {
			for (int coluna=0; coluna<2; coluna++) {
				matriz01[linha][coluna] = (int)Math.round(Math.random() * 99);
				matriz02[linha][coluna] = (int)Math.round(Math.random() * 99);
			}
		}
		
// besteirol __________________________________________________________
		
		for (int cont=0; cont<43; cont++) {
			System.out.print(".");
			Thread.currentThread().sleep(50);
		}
		System.out.println("\n      * Bem vinde à Ebony System * ");
		System.out.println("  Nossa solução é focada na utilização\n"
				+ "de matrizes para os mais variados cálculos.\n "
				+ "Utilize esta demo e existindo interesse,\n"
				+ "     contate-nos por |11| 979714423");
		for (int cont=0; cont<43; cont++) {
			System.out.print("_");
			Thread.currentThread().sleep(50);
		}
//______________________________________________________________________
		
		while (true) {
			
			System.out.print("\n\nMENU PRINCIPAL\n[ 1 ] Somar\n[ 2 ] Subtrair"
					+ "\n[ 3 ] Adicionar Constante\n[ 4 ] Imprimir\n[ 5 ] Sair\nOPÇÃO: ");
			opcao = entrada.nextInt();
			
			if (opcao == 1) {
				System.out.println("\nSomandos os valores das matrizes.");
				for (int cont=0; cont<33; cont++) {
					System.out.print(".");
					Thread.currentThread().sleep(50);
				}System.out.println();
				
				for (int linha=0; linha<2; linha++) {
					for (int coluna=0; coluna<matriz01[linha].length; coluna++) {
						System.out.print("[ " + (matriz01[linha][coluna] + matriz02[linha][coluna]) + "] ");
					}
					System.out.println();
				}
			}
			else if (opcao == 2) {
				System.out.println("\nSubtraindo os valores das matrizes.");
				for (int cont=0; cont<35; cont++) {
					System.out.print(".");
					Thread.currentThread().sleep(50);
				}System.out.println();
				for (int linha=0; linha<2; linha++) {
					for (int coluna=0; coluna<matriz01[linha].length; coluna++) {
						System.out.print("[ " + (matriz01[linha][coluna] - matriz02[linha][coluna]) + "] ");
					}
					System.out.println();
				}
			}
			else if (opcao == 3) {
				
				System.out.print("\nTecle:\n[ 1 ] Matriz01\n[ 2 ] Matriz02\n[ 3 ] Ambas\nOpção: ");
				opcao = entrada.nextInt();
				
				System.out.print("\nDigite um valor real para a constante: ");
				final Double constante  = entrada.nextDouble();			
				
				System.out.println("\nAgora, informe a posição para inserir a constante.");
				System.out.print("linha: ");
				l = entrada.nextInt();
				System.out.print("Coluna: ");
				c = entrada.nextInt();				
				
				if (opcao == 1) {
					matriz01[l][c] = constante;
				}
				else if (opcao == 2) {
					matriz02[l][c] = constante;
				}
				else if (opcao == 3) {
					matriz01[l][c] = constante;
					matriz02[l][c] = constante;
				}
				else {
					System.out.println("Opção inválida!");
				}
			}
			
			else if (opcao == 4) {
				System.out.println("\nImprimindo matriz 01");
				for (int cont=0; cont<20; cont++) {
					System.out.print(".");
					Thread.currentThread().sleep(50);
				}System.out.println();
				for (int linha=0; linha<2; linha++) {
					for (int coluna=0; coluna<matriz01[linha].length; coluna++) {
						System.out.print("[ " + matriz01[linha][coluna] + " ]");
					}
					System.out.println();
				}
				
				System.out.println("\nImprimindo matriz 02");
				for (int cont=0; cont<20; cont++) {
					System.out.print(".");
					Thread.currentThread().sleep(50);
				}System.out.println();
				for (int linha=0; linha<2; linha++) {
					for (int coluna=0; coluna<matriz02[linha].length; coluna++) {
						System.out.print("[ " + matriz02[linha][coluna] + " ]");
					}
					System.out.println();
				}
			}
			
			else if (opcao == 5) {
				System.out.println("\n");
				break;
			}
			
			else {
				System.out.println("Ops, opção inválida!");
			}
		}
		
// besteirol __________________________________________________________
		
				for (int cont=0; cont<44; cont++) {
					System.out.print("*");
					Thread.currentThread().sleep(50);
				}
				System.out.println("\n    Obrigado por utilizar nosso sistema!\n"
						+ "Quaisquer sugestões sempre serão bem vindas,\n"
						+ "nos despedimos esperando ter alçançado suas\n"
						+ "        expectativas e necessidades.\n"
						+ "              Até a próxima...\n"
						+ "                -Ebony Sys-");
				for (int cont=0; cont<44; cont++) {
					System.out.print("*");
					Thread.currentThread().sleep(50);
				}
//______________________________________________________________________		
	}
}
