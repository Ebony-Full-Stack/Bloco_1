package loopFor;
import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros e ao final, 
mostre o maior e menor n�mero digitado.

Autor: Leonardo Alves
*/

public class exe03MaiorNumero {
	public static void main(String[] args) {
		
		int numero, maior = 0, menor = 0;
		Scanner ler = new Scanner (System.in);
		
		for (int cont = 0; cont < 5; cont++) {
			
			System.out.printf("Digite o " + (cont+1) + "� n�mero: ");
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
		System.out.println("\nMaior n�mero: " + maior + "\n"
				+ "Menor n�mero: " + menor);
		ler.close();
	}
}
