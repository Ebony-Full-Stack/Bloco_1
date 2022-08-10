package br.com.generation.conta_poo.model;

public class ContaInss extends Conta{

	private int beneficio;

	public ContaInss(int numero, String agencia, String tipo, String titular, float saldo, int beneficio) {
		super(numero, agencia, tipo, titular, saldo);
		this.beneficio = beneficio;
	}

	public int getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}
	
	public void visualiza() {

		super.visualiza();
		System.out.println("Numero do Benefício: " + this.beneficio);

	}
}
