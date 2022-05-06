package moeda;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		MoedaFormatada dinheiro = new MoedaFormatada("100.99");
		
		dinheiro.somar("49.01");;
		dinheiro.subtrair("0.50");
		dinheiro.multiplicar("2");
		dinheiro.dividir(new BigDecimal("3"));
		
		System.out.println("Valor normal: " + dinheiro.getValor());
		System.out.println("Valor Formatado: " + dinheiro.getValorFormatado());;
		
	}
}
