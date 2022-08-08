package primeirosPassos;

import java.util.Scanner;

/*
 Implemente um programa em Java que leia as coordenadas de dois
 pontos e calcule a dist�ncia entre eles. Lembre-se que a dist�ncia 
 entre dois pontos � dada pela seguinte equa��o: Utilize as fun��es 
 sqrt e pow da classe Math para calcular a raiz quadrada e elevar os 
 n�meros as suas devidas potencias.  

Autor: Leonardo Alves
*/

public class exe01_vers�o1 {
	
	public static void main(String[] args) {
		
		final short diaAtual = 06;
		final short mesAtual = 05;
		final short anoAtual = 2022;
		int dia, mes, ano, total;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos começar cadastrando sua data de nascimento!");
		System.out.print("Dia: ");
		dia = ler.nextInt();
		System.out.print("Agora, o mês: ");
		mes = ler.nextInt();
		System.out.print("Por fim, o ano? ");
		ano = ler.nextInt();
		
		total = ((anoAtual - ano) * 365) + (mesAtual * 30 + dia) + (mes * 30 + dia);
		
		System.out.println("\nLegal, sua idade em dias são: " + total + " dias.");
		
		ler.close();
		
	}
}
