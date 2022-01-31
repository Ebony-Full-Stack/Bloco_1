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
		int num;
		String sair;
		Scanner leia = new Scanner (System.in);
		
		while (true) {
			
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			leia.nextLine();
			System.out.println("Digitar mais um? [S | N]: ");
			sair = leia.nextLine();
			
			if (sair == "S") {
				
				break;
				
			}
			
			
		}
		
		leia.close();
	}
	
}
  