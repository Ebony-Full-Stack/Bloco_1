package loopFor;
import java.util.Scanner;

/*
Faça um programa Tabuada, que permite ao usuário 
informar o número a ser multiplicado.

Autor => Leonardo Alves
*/

public class exe05Tabuada {
	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Digite um n�mero: ");
		numero = ler.nextInt();
		System.out.println("\n===================\n");

		for (int cont = 1; cont <= 10; cont++) {	
			System.out.println(" " + numero + " x " + cont +  " = " + (numero * cont));
		}
		ler.close();
	}
}
