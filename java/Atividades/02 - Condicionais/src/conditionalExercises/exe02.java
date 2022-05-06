package conditionalExercises;

/* 
Faça um programa que entre com três números 
e coloque em ordem crescente.
por -> Leonardo Alves
*/

import java.util.Scanner;

public class exe02 {
	public static void main(String[] args) {
		
		int n1, n2, n3, p=0, s=0, t=0;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Primeiro número: ");
		n1 = ler.nextInt();
		System.out.printf("Segundo número: ");
		n2 = ler.nextInt();
		System.out.printf("Terceiro número: ");
		n3 = ler.nextInt();
		
		if (n1 == n2 && n1 == n3) {
			p = n1;
			s = n2;
			t = n3;
			
		} else if (n1 == n2 && n1 != n3) {
			if (n1 < n3) {
				p = n1;
				s = n2;
				t = n3;
			} else {
				p = n3;
				s = n2;
				t = n1;
			}
		
		} else if (n1 == n3 && n1 != n2) {
			if (n1 < n2) {
				p = n1;
				s = n3;
				t = n2;	
			} else {
				p = n2;
				s = n1;
				t = n3;
			}
		
		} else if (n2 == n3 && n2 != n1) {
			if (n2 < n1) {
				p = n2;
				s = n3;
				t = n1;
			} else {
				p = n1;
				s = n2;
				t = n3;
			}
		
		} else {
			if (n1 < n2 && n1 < n3) {
				p = n1;
				if (n2 < n3) {
					s = n2;
					t = n3;
				} else {
					s = n3;
					t = n2;
				}
			
			} else if (n2 < n1 && n2 < n3) {
				p = n2;
				if (n1 < n3) {
					s = n1;
					t = n3;
				} else {
					s = n3;
					t = n1;
				}
			
			} else {
				p = n3;
				if (n1 < n2) {
					s = n1;
					t = n2;
				} else {
					s = n2;
					t = n1;
				}
			}
		
		}	

		System.out.println("\nNúmeros em ordem crescente: " + p + " " + s + " " + t);
		ler.close();
	}
}
