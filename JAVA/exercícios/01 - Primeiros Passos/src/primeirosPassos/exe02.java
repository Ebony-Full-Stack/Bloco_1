package primeirosPassos;

import java.util.Scanner;

/*
Faça um sistema que leia a idade de uma pessoa expressa 
em dias e mostre-a expressa em anos, meses e dias.

Autor: Leonardo Alves 
*/

public class exe02 {
	public static void main(String[] args) {
		
		int dia, mes, ano, entrada;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		entrada = ler.nextInt();
		
		ano = entrada / 365;
		mes = (entrada % 365) / 30;
		dia = (entrada % 365) % 30;
		
		System.out.println("Até aqui, você viveu " + ano + " anos, " + mes + " meses e " + dia + " dias.");
		
		ler.close();
	}
}
