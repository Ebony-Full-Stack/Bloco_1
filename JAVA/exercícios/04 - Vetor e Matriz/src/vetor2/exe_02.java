package vetor2;

import java.util.ArrayList;

/*
- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

Autor: Leonardo Alves 
*/


public class exe_02 {
	public static void main(String[] args) {
		
		int numeros[] = new int[6];
		ArrayList<Object> pares = new ArrayList<Object>();
		ArrayList<Object> impares = new ArrayList<Object>();
		int somapares=0, totalimpares=0;
		
		for (int cont=0; cont<6; cont++) {
			numeros[cont] = (int)Math.round(Math.random() * 99);
		}
		System.out.print("Array -> ");
		for (int cont=0; cont<6; cont++) {
			System.out.print(numeros[cont] + " ");
		}
		
		for (int cont=0; cont<6; cont++) {
			if (numeros[cont] % 2 == 0) {
				pares.add(numeros[cont]);
				somapares += numeros[cont];
			}
			else {
				impares.add(numeros[cont]);
				totalimpares += 1;
			}
		}
		
		System.out.print("\n\nNúmeros pares -> ");
		for (int cont=0; cont<pares.size(); cont++) {
			System.out.print(pares.get(cont) + " ");
		}
		System.out.println("\nSomando valores pares, temos -> " + somapares);
		
		System.out.print("\nNúmeros Ímpares -> ");
		for (int cont=0; cont<impares.size(); cont++) {
			System.out.print(impares.get(cont) + " ");
		}
		System.out.println("\nTotal de números ímpares -> " + totalimpares);
		
		
	}
}
