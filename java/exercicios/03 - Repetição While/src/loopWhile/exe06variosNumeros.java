package loopWhile;

import java.util.Scanner;

/*
Crie um programa que solicita v�rios n�meros inteiros ao usu�rio, 
pergunte se ele quer continuar digitando e caso responda n�o, 
informe o total de n�meros digitados, o menor, o maior 
e a m�dia entre eles.

Autor Leonardo Alves
*/
public class exe06variosNumeros {

	public static void main(String[] args) {
		int num, cont = 0, soma = 0, maior = 0, menor = 0;
		char sair, s;
		Scanner leia = new Scanner(System.in);

		while (true) {

			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();

			if (cont == 0) {
				maior = num;
				menor = num;
			} else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}

			cont++;
			soma += num;

			leia.nextLine();

			while (true) {
				System.out.print("Digitar mais um? [S | N]: ");
				sair = leia.next().charAt(0);

				s = Character.toUpperCase(sair);

				if (s != 'N' && s != 'S') {
					System.out.println("\nOps, dado inv�lido!\n");

				} else {
					break;
				}
			}
			
			if (s == 'N') {			
				System.out.println("\nTotal de n�meros inseridos..: " + cont);
				System.out.println("Maior n�mero inserido.......: " + maior);
				System.out.println("Menor n�mero inserido.......: " + menor);
				System.out.println("Soma dos n�meros inseridos..: " + soma);
				System.out.println("M�dia dos n�meros inseridos.: " + soma/cont);
				break;
			}
		}

	}
}
