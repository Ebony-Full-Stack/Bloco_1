package vetor;

import java.util.Scanner;

/*
Faça um programa Detetive. O programa deve perguntar:
	a. Esteve no local do crime?
	b. Devia para a vítima?
	c. Mora perto da vítima?
	d. Já trabalhou com a vítima?
	e. Telefonou para a vítima?
	f. Está tenso?

Pós perguntas, o programa deve mostrar o grau de 
participação do usuário no crime. 
Se a pessoa responder sim em 2 questões, ela deve ser 
classificada como Suspeita, entre 3 e 4 como Cúmplice 
e 5 ou 6 como Culpada. 

Autor Leonardo Alves
*/

public class exe07detetive {
	
	public static void main(String[] args) {
	
		String[] perguntas = new String[6];
		char[] respostas = new char[6];
		int soma = 0;
		String status;
		
		Scanner leia = new Scanner (System.in);
		
		perguntas[0] = "Esteve no local do crime.? ";
		perguntas[1] = "Devia para a vítima......? ";
		perguntas[2] = "Mora perto da vítima.....? ";
		perguntas[3] = "Já trabalhou com a vítima? ";
		perguntas[4] = "Telefonou para a vítima..? ";
		perguntas[5] = "Está tenso...............? ";
		
		System.out.println("Por favor, responda apenas [S] ou [N]\n");
		
		for (int cont=0; cont<6; cont++) {	
			System.out.printf(perguntas[cont]);
			respostas[cont] = leia.next().charAt(0);
		}
		
		for (int cont=0; cont<6; cont++) {			
			if (respostas[cont] == 'S' || respostas[cont] == 's') {
				soma++;
			}
		}
		
		if (soma ==1 || soma == 2) {
			status = "Suspeito(a)!";
		}
		else if (soma == 3 || soma == 4) {
			status = "Cúmplice!";
		}
		else if (soma == 5 || soma == 6) {
			status = "Culpado(a)!";
		}
		else {
			status = "Inocente!";
		}
		
		System.out.printf("\nUm momento, estamos analisando suas respostas.\n");
		
		for (int cont=0; cont<46; cont++) {
			
			System.out.print(".");
			try { Thread.sleep (100); } catch (InterruptedException ex) {}
		}
		
		System.out.println("\n\nPós minunciosa análise de suas respostas,\nconcluímos que o Srº(ª) é: " + status);
	}
}
