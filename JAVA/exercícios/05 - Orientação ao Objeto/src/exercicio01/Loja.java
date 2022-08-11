package exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Loja {
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		Cliente cliente = new Cliente();
	
		cabecalho();	
		entradaDados(cliente, ler);
		imprimir(cliente);
		
	}

	// metodo para apresentar o nome da loja
	public static void cabecalho() {
		
		System.out.println("♦======================================================♦");
		System.out.println("♦                    Lojão do EBONY                    ♦");
		System.out.println("♦                      Bem vinde!                      ♦");
		System.out.println("♦=○=○=○=○=○=○=○=○=○=○=○=○=○○=○=○=○=○=○=○=○=○=○=○=○=○=○=♦");
		System.out.println("\n              Bóóóóra cadastrar seus dados!             ");
	}
	
	// metodo para imprimir as informações do cliente no console
	public static void imprimir(Cliente cliente) throws InterruptedException {
		
		System.out.println("\n\n♦======================================================♦");
		System.out.println("♦            Confirme os dados do cliente!             ♦");
		System.out.println("♦=↓=↓=↓=↓=↓=↓=↓=↓=↓=↓=↓=↓=↓=↓↓=↓=↓=↓=↓=↓=↓=↓=↓=↓=↓=↓=↓=♦");
		System.out.println();
		
		Thread.sleep(1000);
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println("CPF: " + cliente.getCpf());
		
		Date dataAtual = cliente.getDtNascimento();
		String dataFormat = new SimpleDateFormat("dd/MM/yyyy").format(dataAtual);
		System.out.println("Data de Nascimento: " + dataFormat);
	}

	// metodo para coletar os dados do cliente
	public static void entradaDados(Cliente cliente, Scanner ler) throws ParseException {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome: ");
		cliente.setNome(ler.nextLine());
		
		System.out.print("Email: ");
		cliente.setEmail(ler.nextLine());
		
		System.out.print("CPF [Apenas numeros]: ");
		cliente.setCpf(ler.nextInt());
		
		System.out.print("Data de Nascimento: ");
		cliente.setDtNascimento(formatador.parse(ler.next()));
	}
}