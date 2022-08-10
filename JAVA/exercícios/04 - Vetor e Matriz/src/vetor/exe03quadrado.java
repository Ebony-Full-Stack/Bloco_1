package vetor;
/*
Faça um Programa que leia um vetor A com 10 números inteiros, 
calcule e mostre a soma dos quadrados dos elementos do vetor.

Autor Leonardo Alves
*/

import java.util.Random;


public class exe03quadrado {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		Random aleatorio = new Random();
		
		for (int cont=0; cont<10; cont++) {
			num[cont] = aleatorio.nextInt(100);
		}
		
		System.out.print("Elementos do vetor...: ");
		
		for (int cont=0; cont<10; cont++) {
			System.out.printf(num[cont] + " ");
		}
		
		System.out.print("\nElementos ao quadrado: ");
		for (int cont=0; cont<10; cont++) {
			System.out.printf((num[cont] * 2) + " ");
		}
	}
}
