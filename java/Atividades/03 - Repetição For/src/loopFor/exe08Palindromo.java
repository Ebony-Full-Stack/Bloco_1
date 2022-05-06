package loopFor;
import java.util.Scanner;

/* FaÃ§a um programa que identifique se uma PALAVRA Ã© ou nÃ£o palÃ­ndromo.
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
			System.out.println("\nA palavra informada é um palíndromo!");
		} else {
			System.out.println("\nA palavra informada NÃO é um palíndromo!");
		}
		ler.close();
	}
}
