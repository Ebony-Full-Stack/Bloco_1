package moeda;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MoedaFormatada {

	private BigDecimal valor;
	private static int CASASDECIMAIS = 2;
	private static final String UNIDADEMONETARIA = "R$";
	private static final DecimalFormat FORMATO = new DecimalFormat(UNIDADEMONETARIA + " #,###,##0.00");

	public MoedaFormatada(String valor) {
		this.valor = new BigDecimal(valor);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public String getValorFormatado() {
		return FORMATO.format(valor);
	}

	public void somar(String valorSoma) {
		this.valor = this.valor.add(new BigDecimal(valorSoma));
	}

	public void subtrair(String valorSub) {
		this.valor = this.valor.subtract(new BigDecimal(valorSub));
	}

	public void multiplicar(String valorMult) {
		this.valor = this.valor.multiply(new BigDecimal(valorMult));
	}

	public void dividir(BigDecimal valorDiv) {
		if (valorDiv.compareTo(BigDecimal.ZERO) == 0) {
			System.out.println("Ops, não posso dividir por 0");
		} else {
			this.valor = this.valor.divide(valorDiv, CASASDECIMAIS, RoundingMode.HALF_EVEN);
		}
	}
}
