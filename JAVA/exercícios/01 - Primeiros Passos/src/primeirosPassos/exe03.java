package primeirosPassos;

import java.util.Scanner;

/*
Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

Autor: Leonardo Alves
*/

public class exe03 {
	public static void main(String[] args) {
		
		int horas, minutos, segundos;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o tempo em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.println("\nTempo: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		
		ler.close();
	}
}
