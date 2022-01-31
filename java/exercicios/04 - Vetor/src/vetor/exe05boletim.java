package vetor;

import java.util.Scanner;

/*
Faça um Programa que peça as quatro notas de 3 alunos, 
calcule e armazene num vetor a média de cada aluno, 
imprima o número de alunos com média maior ou igual a 7.0.

Autor Leonardo Alves
*/

public class exe05boletim {
	public static void main(String[] args) {
		
		double[] medias = new double[4];
		double soma = 0.0;
		int maior7 = 0;
		Scanner leia = new Scanner (System.in);
		
		for (int alune=0; alune<3; alune++) {
			System.out.println("\n" + (alune+1) + "º Alune.");
			
			for (int nota=0; nota<4; nota++) {
				System.out.print("[ " + (nota+1) + "º ] Nota: ");
				soma += leia.nextDouble();
			}
			medias[alune] = soma/4;
			
			if ((soma/4) >= 7.0) {
				maior7 += 1;
			}
			
		}
		leia.close();
		
		System.out.println("\n\nTotal de alunes com média maior ou igual a 7.0: " + maior7);
	}
}
