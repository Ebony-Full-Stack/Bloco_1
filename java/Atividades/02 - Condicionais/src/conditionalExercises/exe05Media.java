package conditionalExercises;

import java.util.Scanner;

/*
Faça um programa que receba 4 notas, calcule a média do aluno 
e mostre na tela: A média do aluno e a situação final, sendo:
Aprovado com nota igual ou superior a 7, em recuperação se a 
nota estiver entre 6.9 e 5 e reprovado com nota menor que 5. 

Autor: Leonardo Alves
*/


public class exe05Media {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double n1, n2, n3, n4, media=0.0;
		String status;
		
		System.out.printf("Digite a 1ª nota: ");
		n1 = ler.nextDouble();
		
		System.out.printf("Digite a 2ª nota: ");
		n2 = ler.nextDouble();
		
		System.out.printf("Digite a 3ª nota: ");
		n3 = ler.nextDouble();
		
		System.out.printf("Digite a 4ª nota: ");
		n4 = ler.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >= 7.0 && media <= 10) {
			status = "Aprovado.";
		
		} else if (media < 7.0 && media >= 5.0) {
			status = "Em Recuperação.";
		
		} else if (media < 5 && media >= 0) {
			status = "Reprovado.";
		
		} else {
			status = "Ops, algo errado não está certo!";
		}
		
		System.out.printf("\nCom média: %.1f", media); 
		System.out.println("\nSituação: " + status);
		ler.close();
		
	}
}
