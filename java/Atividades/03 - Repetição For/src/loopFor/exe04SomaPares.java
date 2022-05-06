package loopFor;

/*
Faça um programa que mostre a soma dos valores pares 
entre 0 e 50. O mesmo para os valores Ã­mpares.

Autor ==> Leonardo Alves
*/

public class exe04SomaPares {
	public static void main(String[] args) {
		int somaP = 0, somaI = 0;
		
		for (int cont = 0; cont <= 50; cont++) {
			if (cont % 2 == 0) {
				somaP += cont;		
			} else {
				somaI += cont;
			}
		}
		System.out.println("\nSomando números pares, temos: " + somaP + "\n"
				+ "Somando números ímpares, temos: " + somaI);
	}
}
