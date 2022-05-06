package conditionalExercises;

/*
Faça um programa que receba a idade de uma pessoa 
e mostre na saída em qual categoria ela se encontra:
• 10-14 infantil
• 15-17 juvenil
• 18-25 adulto 

Autor: Leonardo Alves
*/

import java.util.Scanner;

public class exe03 {
	
	public static void main(String[] args) {
		int idade;
		String categoria;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("\nInforme sua idade: ");
		idade = ler.nextInt();
		
		if (idade >= 18 && idade <= 18) {
			categoria = "Adulto";
	
		} else if (idade >= 15 && idade <= 17) {
			categoria = "Juvenil";
		
		} else if (idade >= 10 && idade <= 14) {
			categoria = "Infantil";
		
		} else {
			categoria = "Não foi possível categorizar com a idade inserida.";
		}

		System.out.println("\nIdade: " + idade + "\nCategoria: " + categoria);
		ler.close();
	}
}



