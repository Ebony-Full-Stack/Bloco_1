package vetor2;

// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
// Autor: Leonardo Alves

import java.util.Scanner;

public class exe_03 {
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		Scanner entrada = new Scanner(System.in);
		int soma=0;
		
		for (int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
	
//				System.out.printf("Digite um valor para posição [" + linha + "]"
//						+ "[" + coluna + "]: ");
//				matriz[linha][coluna] = entrada.nextInt();
				
				matriz[linha][coluna] = (int)Math.round(Math.random() * 99); 
			}
		}
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (matriz[linha][coluna] > 10) {
					soma += 1;
				}
				System.out.print("[" + matriz[linha][coluna] + "]");
			}
			System.out.println();
		}
		System.out.printf("\nTotal de valores maiores que 10: " + soma);
	}
}
