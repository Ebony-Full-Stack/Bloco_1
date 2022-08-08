package primeirosPassos;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor. 

Autor: Leonardo Alves
*/
public class exe08 {
	public static void main(String[] args) {
		
		double valorFinal, valorFabrica, valoradc=1.73; //distribuidor=0.28 + impostos=0.45 = 1.73;
		Scanner ler = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		
		System.out.print("Informe o valor de fabrica: R$");
		valorFabrica = ler.nextDouble();
		
		valorFinal = valorFabrica + (valorFabrica * valoradc);
		
		System.out.println("\nValor final: R$" + f.format(valorFinal));
		
		ler.close();
	}
}
