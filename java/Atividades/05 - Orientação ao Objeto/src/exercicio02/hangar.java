package exercício02;
// Leonardo Alves

import java.util.Scanner;

public class hangar {
	public static void main(String[] args) throws InterruptedException {
	
		Aviao aviao = new Aviao();
		Scanner ler = new Scanner(System.in);
		
		cabecalho("Hangar EBONY Aviações", "Voe sempre com segurança!!!");
		dadosEntrada(aviao, ler);
		dadosImprimir(aviao);
	
		ler.close();
	}
		
	// metodo de mensagem personalizada
	public static void cabecalho(String titulo, String texto) {
		System.out.println("\n========================================");
		
		for(int i = 0; i < (40 - titulo.length()); i++) {
			System.out.print("_");
		}
		System.out.println(titulo);
		for(int i = 0; i < (40 - texto.length()); i++) {
			System.out.print("_");
		}
		System.out.println(texto);
		System.out.println("========================================\n");
	}
	
	
	// metodo para entrada de dados 
	public static void dadosEntrada(Aviao aviao, Scanner ler) {		
		System.out.print("MODELO: ");
		aviao.setModelo(ler.nextLine().toUpperCase());
		
		System.out.print("FABRICANTE: ");
		aviao.setFabricante(ler.nextLine().toUpperCase());
		
		System.out.print("TOTAL DE H/V: ");
		aviao.setHorasVoo(ler.nextInt());
		
		System.out.print("STATUS [A - Ativo | NA - Não ativo]: ");
		aviao.setStatus(ler.next().toUpperCase());
	}
	

	public static void dadosImprimir(Aviao aviao) throws InterruptedException {
		cabecalho("Processando dados inseridos", "Por favor, aguarde!");
	
		Thread.sleep(1000);
		
		System.out.println(" MODELO......: " + aviao.getModelo()); Thread.sleep(300);
		System.out.println(" FABRICANTE..: " + aviao.getFabricante()); Thread.sleep(300);
		System.out.println(" TOTAL DE H/V: " + aviao.getHorasVoo()); Thread.sleep(300);
		System.out.println(" STATUS......: " +  aviao.getStatus());	
	}
}
