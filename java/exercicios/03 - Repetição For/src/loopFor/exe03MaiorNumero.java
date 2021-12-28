package loopFor;
import java.util.Scanner;

/*
Faça um programa que leia 5 números e ao final, 
mostre o maior e menor número digitado.

Autor: Leonardo Alves
*/

public class exe03MaiorNumero {
	public static void main(String[] args) {
		
		int numero, maior = 0, menor = 0;
		Scanner ler = new Scanner (System.in);
		
		for (int cont = 0; cont < 5; cont++) {
			
			System.out.printf("Digite o " + (cont+1) + "º número: ");
			numero = ler.nextInt();
			
			if (cont == 0) {
				maior = numero;
				menor = numero;
			}
			if (numero > maior) {
				maior = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}
		System.out.println("\nMaior número: " + maior + "\n"
				+ "Menor número: " + menor);
		ler.close();
	}
}
