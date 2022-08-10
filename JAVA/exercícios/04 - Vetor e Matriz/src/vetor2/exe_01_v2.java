package vetor2;

/*
Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

Autor: Leonardo Alves
*/

public class exe_01_v2 {
	public static void main(String[] args) {
		int a[] = {1,0,5,-2,-5,7};
		int soma=0;
		
		for (int cont=0; cont<6; cont++) {
			if (cont == 0 || cont == 1 || cont == 5) {
				soma += a[cont];
			}
			if (cont == 4) {
				a[cont] = 100;
			}
			System.out.println(a[cont]);
		}	
		System.out.printf("Somando os valores das posições [0,1 e 5], temos: %d", soma );
	}
}
