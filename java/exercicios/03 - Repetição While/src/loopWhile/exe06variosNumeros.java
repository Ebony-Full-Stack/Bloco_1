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
		int num;
		String sair;
		Scanner leia = new Scanner (System.in);
		
		while (true) {
			
			System.out.println("Digite um n�mero: ");
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
  