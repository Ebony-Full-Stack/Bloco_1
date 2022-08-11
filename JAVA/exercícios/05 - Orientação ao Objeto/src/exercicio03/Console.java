package exercicio03;
// Leonardo Alves

public class Console {
	public static void main(String[] args) {
	
		produtoEletronico console = new produtoEletronico();
		
		entrada(console);
		imprimir(console);
		console.lVenda();
	}
	
	public static void entrada(produtoEletronico console) {
		
		console.setNome("Xbox");
		console.setModelo("Series X");
		console.setFabricante("Microssoft");
		console.setCor("Preto");
		console.setSsd("2T");
		console.setRam(16);
		console.setPrecoCusto(3000.55);
		console.setPrecoVenda(10000.99);
	}
	
	public static void imprimir(produtoEletronico console) {
		System.out.println("PRODUTOS CAT . CONSOLE\n");
		
		System.out.println("Nome..........: " + console.getNome());
		System.out.println("Modelo........: " + console.getModelo());
		System.out.println("Fabricante....: " + console.getFabricante());
		System.out.println("Cor...........: " + console.getCor());
		System.out.println("SSD...........: " + console.getSsd());
		System.out.println("RAM...........: " + console.getRam());
		System.out.println("Preço de Custo: " + console.getPrecoCusto());
		System.out.println("Preço de Venda: " + console.getPrecoVenda());
	}
}
