package primeirosPassos;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Um sistema de equações lineares do tipo: ax + by = c ¨ dx + ey = f
pode ser resolvido segundo mostrado abaixo: 

 x = ce - bf        y = af - cd 
     ae - bd            ae - bd

escreva um sistema que lê os coeficientes a, b, c, d, e, f e calcule 
e mostre os valores x e y.


Autor: Leonardo Alves
*/

public class exe07 {
	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		Scanner ler = new Scanner(System.in);
		DecimalFormat ft = new DecimalFormat("0.0");
		
		System.out.println("Vamos começar... informe os coeficientes:");
		System.out.print("A: ");
		a = ler.nextDouble();
		System.out.print("B: ");
		b = ler.nextDouble();
		System.out.print("C: ");
		c = ler.nextDouble();
		System.out.print("D: ");
		d = ler.nextDouble();
		System.out.print("E: ");
		e = ler.nextDouble();
		System.out.print("F: ");
		f = ler.nextDouble();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));    
		
		System.out.println("\nValores de saída.\nX: " + ft.format(x) + "\nY: " + ft.format(y));
		 
	}
}
