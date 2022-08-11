package exercicio02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {
	
	public static void main(String[] args) {
		
		ArrayList<Produto> camisa = new ArrayList<>();
		ArrayList<Produto> calça = new ArrayList<>();
		ArrayList<Produto> sapato = new ArrayList<>();
		

		JOptionPane.showMessageDialog(null, "Adicionando Camisas...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		addProduto(camisa);
		
		JOptionPane.showMessageDialog(null, "Adicionando Calças...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		addProduto(calça);
		
		JOptionPane.showMessageDialog(null, "Adicionando Sapatos...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		addProduto(sapato);
		
		//apresentar todos os dados da list
		System.out.println("********** Lista Adicionada **********");
		printProduto(camisa);
		printProduto(calça);
		printProduto(sapato);
		
		
		//**********************remover dados da list
		JOptionPane.showMessageDialog(null, "Deletando Camisa...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		delProduto(camisa);
		
		JOptionPane.showMessageDialog(null, "Deletando Calça...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		delProduto(calça);
		
		JOptionPane.showMessageDialog(null, "Deletando Sapato...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		delProduto(sapato);
		
		//apresentar todos os dados da list
		System.out.println("\n\n********** Lista Atualizada com as Exclusões **********");
		printProduto(camisa);
		printProduto(calça);
		printProduto(sapato);
		
		
		//atualizar dados da list
		JOptionPane.showMessageDialog(null, "Atualizando Camisa...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		atualProduto(camisa);
		
		JOptionPane.showMessageDialog(null, "Atualizando Calça...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		atualProduto(calça);
		
		JOptionPane.showMessageDialog(null, "Atualizando Sapato...", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		atualProduto(sapato);
		
		//apresentar todos os dados da list
		System.out.println("\n\n********** Lista Atualizada com as Alterações **********");
		printProduto(camisa);
		printProduto(calça);
		printProduto(sapato);
		
	}
	
	static void addProduto(ArrayList<Produto> produto) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(
				"Quantos produtos você deseja adicionar? "));
		for(int i = 0; i < num; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
			produto.add(new Produto(nome, valor));
		}
	}
	
	static void delProduto(ArrayList<Produto> produto) {
		
		int pd = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição que deseja deletar: "));
		while(pd < 0 || pd >= produto.size()) {
			JOptionPane.showMessageDialog(null, "Valor inválido!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			pd = Integer.parseInt(JOptionPane.showInputDialog("Digite o námero da posição que deseja deletar: "));
		}
		produto.remove(pd);
	}
	
	static void atualProduto(ArrayList<Produto> produto) {
		
		int numAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição do produto que deseja atualizar: "));
		while(numAt < 0 || numAt >= produto.size()) {
			JOptionPane.showMessageDialog(null, "Valor inválido!!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			numAt = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição do produto que deseja atualizar: "));
		}
		String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
		produto.set(numAt, (new Produto(nome, valor)));
	}
	
	static void printProduto(ArrayList<Produto> produto) {
		
		System.out.print("\nLista de Produtos**************************");
		for(Produto p : produto) {
			System.out.println(p);
		}
	}
}