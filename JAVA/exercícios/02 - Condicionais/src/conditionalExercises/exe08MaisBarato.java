package conditionalExercises;
import java.util.Scanner;

/*
Faça um programa que peça o preço de 3 produtos e informe 
ao usuário qual produto ele deve comprar, sendo que, o 
usuário deseja comprar aquele que for mais barato.

Autor: Leonardo Alves
*/

public class exe08MaisBarato {

	public static void main(String[] args) {
		
		double p1, p2, p3;
		String prod1, prod2, prod3, compre="";
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Digite o nome do produto: ");
		prod1 = ler.nextLine();
		System.out.printf("Produto: " + prod1 + " | Preço: ");
		p1 = ler.nextDouble();
		
		ler.nextLine();
		System.out.printf("\nDigite o nome do produto: ");
		prod2 = ler.nextLine();
		System.out.printf("Produto: " + prod2 + " | Preço: ");
		p2 = ler.nextDouble();
		
		ler.nextLine();
		System.out.printf("\nDigite o nome do produto: ");
		prod3 = ler.nextLine();
		System.out.printf("Produto: " + prod3 + " | Preço: ");
		p3 = ler.nextDouble();
		
		if (p1 == p2 && p1 == p3) {
			compre = prod1 + ", " + prod2 + " e " + prod3;
			
		} else if (p1 == p2) {
			if (p1 < p3) {
				compre = prod1 + " e " + prod2;
			}
		
		} else if (p1 == p3) {
			if (p1 < p2) {
				compre = prod1 + " e " + prod3;
			}
			
		} else if (p2 == p3) {
			if (p2 < p1) {
				compre = prod2 + " e " + prod3;
			}
			
		} else {
			if (p1 < p2 && p1 < p2) {
				compre = prod1;
				
			} else if (p2 < p1 && p2 < p3) {
				compre = prod2;
			
			} else {
				compre = prod3;
			}
		}
		
		System.out.println("\nMelhor compra: " + compre);
		ler.close();
	}
	
}
