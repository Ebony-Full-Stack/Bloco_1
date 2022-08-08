package primeirosPassos;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
A fórmula que efetua tal cálculo é:
 
                  d = raiz (x2-x1)² + (y2 - y1)²
 
Autor: Leonardo Alves
*/
public class exe06 {
	public static void main(String[] args) {
	
		double x1, x2, y1, y2, d;
		DecimalFormat formatar = new DecimalFormat("0.00");
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um valor para X1: ");
		x1 = ler.nextDouble();
		System.out.print("Digite um valor para X2: ");
		x2 = ler.nextDouble();
		System.out.print("Digite um valor para Y1: ");
		y1 = ler.nextDouble();
		System.out.print("Digite um valor para Y2: ");
		y2 = ler.nextDouble();
		
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("\nDistância calculado foi de: " + formatar.format(d));
		
		ler.close();
	}
}
