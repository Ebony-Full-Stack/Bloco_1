package loopWhile;

import java.util.Scanner;

/*
Crie um programa que solicita vários números inteiros ao usuário, 
pergunte se ele quer continuar digitando e caso responda não, 
informe o total de números digitados, o menor, o maior 
e a média entre eles.

Autor Leonardo Alves
*/
public class exe06variosNumeros {

	public static void main(String[] args) {
		int num, cont = 0, soma = 0, maior = 0, menor = 0;
		char sair, s;
		Scanner leia = new Scanner(System.in);

		while (true) {

			System.out.print("Digite um número: ");
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
					System.out.println("\nOps, dado inválido!\n");

				} else {
					break;
				}
			}
			
			if (s == 'N') {			
				System.out.println("\nTotal de números inseridos..: " + cont);
				System.out.println("Maior número inserido.......: " + maior);
				System.out.println("Menor número inserido.......: " + menor);
				System.out.println("Soma dos números inseridos..: " + soma);
				System.out.println("Média dos números inseridos.: " + soma/cont);
				break;
			}
		}

	}
}
