package vetor;
import java.util.Scanner;

/*
Faça um Programa com um vetor de 5 números reais 
e mostre-os na ordem inversa.

Autor Leonardo Alves
*/

public class exe01ordemInversa {
	public static void main(String[] args) { 
		try (Scanner ler = new Scanner (System.in)) {
			double[] vetor = new double[5];
			int cont;
			
			// populando o vetor
			for (cont=0; cont < vetor.length; cont++) {
				System.out.printf("Digite um valor: ");
				vetor[cont] = ler.nextDouble();
			}
			
			// Mostrando na ordem que foi inserido
			System.out.printf("\nValores em ordem normal.: ");
			for (cont=0; cont < vetor.length; cont++) {
				
				if (cont == 4) {
					System.out.printf(vetor[cont] + ", ".replace(", ", " "));
				} else {
					System.out.printf(vetor[cont] + ", ");
				} 
			}
			
			// Mostrando em ordem inversa
			System.out.printf("\nValores em ordem inversa: ");
			for (cont=(vetor.length)-1; cont >= 0; cont--) {
				if (cont == 0) {
					System.out.printf(vetor[cont] + ", ".replace(", ", " "));
				} else {
					System.out.printf(vetor[cont] + ", ");
				} 
			}			
			ler.close();
		}
	}
}
