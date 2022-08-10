package vetor;
import java.util.Random;

/*
Faça um Programa que tenha uma lista com 20 números inteiros 
aleatórios no intervalo 0 – 50 e armazene-os. Armazene os 
números pares no vetor PAR e os números IMPARES no vetor 
ímpar, imprima todos os vetores.

Autor Leonardo Alves
*/

public class exe04parImpar {
	public static void main(String[] args) {	
		int[] numeros = new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];
		Random random = new Random();
		int cont;
		
		for (cont = 0; cont < 20; cont++) {			
			numeros[cont] = random.nextInt(50);	
			if (numeros[cont] % 2 == 0) {
				pares[cont] = numeros[cont];
			} else {
				impares[cont] = numeros[cont];
			}	
		}
		System.out.printf("Números: ");	
		for (cont = 0; cont < numeros.length; cont++) {
			System.out.printf(numeros[cont] + " ");
		}
		System.out.printf("\nPares..: ");
		for (cont = 0; cont < pares.length; cont++) {
			if (pares[cont] != 0) {
				System.out.printf(pares[cont] + " ");
			}
		}
		System.out.printf("\nÍmpares: ");
		for (cont = 0; cont < impares.length; cont++) {
			if (impares[cont] != 0) {
				System.out.printf(impares[cont] + " ");
			}
		}
	}
}
