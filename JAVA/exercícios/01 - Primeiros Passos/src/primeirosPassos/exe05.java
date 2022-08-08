package primeirosPassos;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente. 

Autor: Leonardo Alves
*/
public class exe05 {
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media;
		DecimalFormat formatado = new DecimalFormat("0.0");
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a 1ª nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Informe a 2ª nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Informe a 3ª nota: ");
		nota3 = ler.nextDouble();
		
		media = ((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5) / (1)); 
		
		System.out.println("\nMédia ponderada: " + formatado.format(media));
		
		ler.close();
	}
}
