package loopFor;
import java.util.Scanner;

// Ler 10 n�meros e imprimir quantos s�o Pares e quantos s�o �mpares.
// Autor: Leonardo Alves

public class exe02 {
	public static void main(String[] args) {
		int numero, somaP = 0, somaI = 0;
		Scanner ler = new Scanner (System.in);
		
		for (int cont = 0; cont < 10; cont++) {
			System.out.printf("Digite o " + (cont+1) + "� n�mero: ");
			numero = ler.nextInt();
		
			if (numero % 2 == 0) {
				somaP++;
			} else {
				somaI++;
			}
		}
		System.out.println("\nTotal de número pares: " + somaP + "\n"
				+ "Total de números ímpares: " + somaI);
		ler.close();
	}
}
