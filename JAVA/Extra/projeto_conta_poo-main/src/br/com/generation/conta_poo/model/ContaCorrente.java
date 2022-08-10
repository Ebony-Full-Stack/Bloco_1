package br.com.generation.conta_poo.model;

public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(int numero, String agencia, String titular, String tipo, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public boolean deposito(float valor) {

		if (valor > 0) {
			float nsaldo = this.getSaldo();
			nsaldo += valor;
			this.setSaldo(nsaldo);
			return true;
		} else {
			return false;
		}

	}

	public boolean saque(float valor) {

		float nsaldo = this.getSaldo();

		if (valor <= this.getSaldo() + limite) {
			nsaldo -= valor;
			this.setSaldo(nsaldo);
			return true;
		} else
			return false;
	}

	public boolean transferencia(float valor, ContaCorrente contaDestino) {
		
		if (valor <= this.getSaldo()) {
			if (this.saque(valor) == true) {
				contaDestino.deposito(valor);
				return true;
			} else
				return false;
		} else
			
			return false;
	}
	
	public void visualiza() {

		super.visualiza();
		System.out.println("Limite: " + this.limite);

	}


}
