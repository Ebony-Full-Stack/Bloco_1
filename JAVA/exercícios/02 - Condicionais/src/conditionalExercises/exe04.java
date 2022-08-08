package conditionalExercises;

/*
 Faça um programa em que permita a entrada de um número qualquer 
 e exiba se este número é par ou ímpar. Se for par exiba também a 
 raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado. 

Autor: Leonardo Alves
*/

import java.util.Scanner;

public class exe04 {
	public static void main(String[] args) {
		
		int numero;		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Digite um número: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("\nO número " + numero + " é PAR.\n"
					+ "Elevando ao quadrado, temos: " + Math.pow(numero, 2));
			
		} else {
			System.out.println("\nO número " + numero + " é ÍMPAR.");
		}
		
		ler.close();
	}	
}
