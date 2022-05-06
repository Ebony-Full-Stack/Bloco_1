package loopFor;
import java.util.Scanner;

/* Faça um programa que identifique se uma PALAVRA é ou não palíndromo.
-> teste com: Arara, esse, metem, mirim, Ana, salas, radar, reviver 
Autor => Leonardo Alves
*/ 

public class exe08Palindromo {
	public static void main(String[] args) {
		String palavra, invertida="";
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Digite uma palavra: ");
		palavra = ler.nextLine().strip().toLowerCase();
		
		for (int cont = palavra.length() -1; cont >= 0; cont--) {
			invertida += palavra.charAt(cont);
		}
		if (palavra.equals(invertida)) {
			System.out.println("\nA palavra informada � um pal�ndromo!");
		} else {
			System.out.println("\nA palavra informada N�O � um pal�ndromo!");
		}
		ler.close();
	}
}
