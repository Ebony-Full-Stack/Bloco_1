package conditionalExercises;

import java.util.Scanner;

/*
Faça um programa que peça a medida de 3 retas, informe ao usuário se, 
com estas 3 retas é possível formar um triângulo. Se com estas retas 
for possível formar um triangulo, o programa deve informar se este 
triangulo é: equilátero, isósceles ou escaleno. 

Autor: Leonardo Alves
*/

public class exe06Triangulo {
	public static void main(String[] args) {
		
		double reta1, reta2, reta3;
		String tipo;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Digite a medida em metros da 1ª reta: ");
		reta1 = ler.nextDouble();
		System.out.printf("Digite a medida em metros da 2ª reta: ");
		reta2 = ler.nextDouble();
		System.out.printf("Digite a medida em metros da 3ª reta: ");
		reta3 = ler.nextDouble();
		
		if (reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2) {
			if (reta1 == reta2 && reta1 == reta3) {
				tipo = "Equilátero.";
				
			} else if (reta1 != reta2 && reta2 == reta3 && reta1 != reta3) {
				tipo = "Escaleno.";
			
			} else {
				tipo = "Isósceles.";
			}
			
			System.out.printf("\nFoi possível formar um triângulo do tipo: %s", tipo);
		} else {
			System.out.println("\nNão é possível formar um triângulo com as medidas inseridas.");
		}
		
		ler.close();
	}	
}
