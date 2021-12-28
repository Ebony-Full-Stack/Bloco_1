package conditionalExercises;

// Faça um programa que receba três inteiros e diga qual deles é o maior
// por -> Leonardo Alves

import java.util.Scanner;

public class exe01 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int n1, n2, n3, maiorNumero = 0;
		
		System.out.printf("Digite o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite o segundo número: ");
		n2 = ler.nextInt();

		System.out.printf("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			maiorNumero = n1;
		
		} else if (n2 > n1 && n2 > n3) {
			maiorNumero = n2;
			
		} else if (n3 > n1 && n3 > n2) {
			maiorNumero = n3;
			
		} else {
			System.out.println("\nOs 3 números são iguais!");
		}
		
		System.out.printf("\nMaior número: %d", maiorNumero);
		
		ler.close();
	}
}
