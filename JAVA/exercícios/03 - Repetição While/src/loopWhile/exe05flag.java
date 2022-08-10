package loopWhile;
/*
Crie um programa que peça vários números ao usuário 
e interrompa quando o usuário digitar 999, ao final, 
mostre a soma de todos os valores digitados, sem o FLAG.

Autor Leonardo Alves
*/

import java.util.Scanner;

public class exe05flag {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int soma = 0, num=0;
		
		while (num != 999) {
			System.out.print("Digite um número [999 para sair]: ");
			num = leia.nextInt();
			
			if (num != 999) {
				soma += num;
			}
		}
		
		leia.close();
		System.out.println("\nSomando valores inseridos, temos: " + soma);
	}
}
