package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class produtoEletronico {
	
	private String nome, modelo, fabricante, cor, ssd;
	private Integer ram;
	private double precoCusto, precoVenda;
	
	Scanner ler = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
	}

	public DecimalFormat getFormatar() {
		return formatar;
	}

	public void setFormatar(DecimalFormat formatar) {
		this.formatar = formatar;
	}

	void lVenda() {
		String status;
		System.out.print("\nStatus: ");
		status = ler.next();
		ler.close();
	}
}
