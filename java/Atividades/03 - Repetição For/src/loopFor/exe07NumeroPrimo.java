package loopFor;
import java.util.Scanner;

/*
FaÁa um programa que leia um n˙mero inteiro 
e na sequencia mostre se ele È ou n„o um n˙mero primo. 
(N˙meros primos s„o divisiveis por 1 e eles mesmos apenas).

Autor => Leonardo Alves
*/

public class exe07NumeroPrimo {
	public static void main(String[] args) {
		
		int numero, cont, somaD = 0;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Digite um n√∫mero: ");
		numero = ler.nextInt();
		
		for (cont = 1; cont <= numero; cont++) {	
			if (numero % cont == 0) {
				somaD++;
			}
		}
		if (somaD <= 2) {
			System.out.println("\nO n˙mero " + numero + " È um n˙mero PRIMO.");	
		} else {
			System.out.println("\nO n˙mero " + numero + " n„o È um n˙mero PRIMO.");
		}
		ler.close();
	}
}
