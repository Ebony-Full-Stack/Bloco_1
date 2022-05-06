package vetor;

import java.util.Scanner;

/*
Faça um Programa que leia 4 notas, mostre as notas 
e a média na tela, de forma que, todas as notas sejam 
armazenadas em um vetor antes dos cálculos.

Autor Leonardo Alves
*/

public class exe02media {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double[] notas = new double[5];
		double soma = 0.0;
		
		for (int cont=0; cont < 4; cont++) {
			System.out.printf((cont +1) + "ª nota: ");
			notas[cont] = leia.nextDouble();
			soma += notas[cont];
		}
		
		System.out.printf("Notas: ");
		for (int cont=0; cont < 4; cont++) {			
			 System.out.printf(notas[cont] + "  ");
		}
		
		System.out.printf("\nMédia: %.1f", soma/notas.length);
	}

}
