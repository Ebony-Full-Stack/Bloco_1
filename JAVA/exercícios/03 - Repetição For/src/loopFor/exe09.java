package loopFor;

import java.util.*;

/*
Faça um programa que leia ano de nascimento 
de 5 pessoas e no final mostra quantas pessoas 
j� atingiram a maioridade e para aquelas que 
ainda n�o atingiram, mostre a média em anos que 
faltam para chegarem a maioridade.

Auto => Leonardo Alves
*/

public class exe09 {
	public static void main(String[] args) {
		
		Calendar dataAtual = Calendar.getInstance();
		int anoAtual = dataAtual.get(Calendar.YEAR), anoNasc;
		int maiorI=0, somaI=0, menor=0;
		Scanner ler = new Scanner (System.in);
		
		for (int cont = 1; cont <= 5; cont++) {
			System.out.printf(cont + "ª Pessoa | Digite seu ano de nascimento: ");
			anoNasc = ler.nextInt();
			
			if ((anoAtual - anoNasc) >= 18) {
				maiorI++;
			} else {
				somaI += 18 - (anoAtual - anoNasc);
				menor++;
			}	
		}
		System.out.println("\nTotal de pessoas maiores de idade: " + maiorI);
		System.out.println("Média de idade faltante para completarem 18 anos: " + (somaI / menor));
		ler.close();
	}	
}
