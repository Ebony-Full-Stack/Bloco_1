package primeirosPassos;

import java.util.Scanner;
/*
Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D = (R + S) / 2 | R = (A + B)² onde S = (B + C)²

Autor: Leonardo Alves
*/

public class exe04 {
	public static void main(String[] args) {
	
		double a, b, c, d, r, s;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um valor para A: ");
		a = ler.nextInt();
		System.out.print("Informe um valor para B: ");
		b = ler.nextInt();
		System.out.print("Informe um valor para C: ");
		c = ler.nextInt();
		
		s = Math.pow((b + c), 2);
		r = Math.pow((a + b), 2);
		d = (r + s) / 2;
		
		System.out.println("\nResultado: " + d);
				
		ler.close();
	}
}
