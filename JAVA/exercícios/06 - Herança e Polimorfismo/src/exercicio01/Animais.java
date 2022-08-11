package exercicio01;
// PS. apenas herança... sem array

import java.util.Scanner;

public class Animais {
	
	static int escolha;
	
	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro();
		Animal cavalo = new Cavalo();
		Animal preguica = new Preguica();
		
		Scanner ler = new Scanner(System.in);
		
		cadastro(cachorro, cavalo, preguica, ler);
		som(cachorro, cavalo, preguica, ler);
	}
	
	public static void cadastro(Animal cachorro, Animal cavalo, Animal preguica, Scanner ler) {
		
		System.out.print("Vamos começar os cadastros, \nmas antes... escolhe aqui ↓\n"
				+ "\n[1] CACHORRO\n[2] CAVALO\n[3] PREGUIÇA\nOpção: ");
		escolha = ler.nextInt();
		
		while(escolha < 1 || escolha > 3 ) {
			
			System.out.println("\nOps, dado inválido! Tente novamente...\n");
			
			System.out.print("Vamos começar os cadastros, \nmas antes... escolhe aqui ↓\n"
					+ "\n[1] CACHORRO\n[2]CAVALO\n[3]PREGUIÇA\nOpção: ");
			escolha = ler.nextInt();	
		}
		if(escolha == 1) {
			cadCachorro(cachorro, ler);
		}
		else if(escolha == 2) {
			cadCavalo(cavalo, ler);
		}
		else {
			cadPreguica(preguica, ler);
		}
	}
	
	
	// criando cadastro para cada animal... 
	public static void cadCachorro(Animal cachorro, Scanner ler) {
		
		System.out.print("\nNome do seu cachorro: ");
		cachorro.setNome(ler.next());
		
		System.out.print("Legal, e a idade dele: ");
		cachorro.setIdade(ler.nextInt());
		
		System.out.print("Por fim, qual som ele faz: ");
		cachorro.setSom(ler.next());
	}
	
	public static void cadCavalo(Animal cavalo, Scanner ler) {
		
		System.out.print("\nNome do seu cavalo: ");
		cavalo.setNome(ler.next());
		
		System.out.print("Legal, e a idade dele: ");
		cavalo.setIdade(ler.nextInt());
		
		System.out.print("Por fim, qual som ele faz: ");
		cavalo.setSom(ler.next());
	}
	
	public static void cadPreguica(Animal preguica, Scanner ler) {
		
		System.out.print("\nNome do seu preguiça: ");
		preguica.setNome(ler.next());
		
		System.out.print("Legal, e a idade dele: ");
		preguica.setIdade(ler.nextInt());
		
		System.out.print("Por fim, qual som ele faz: ");
		preguica.setSom(ler.next());
	}
	
	
	public static void somCachorro(Animal cachorro) {
		System.out.println("O cachorro " + cachorro.getNome() + 
		" está latindo... " + cachorro.getSom());
	}
	public static void somCavalo(Animal cavalo) {
		System.out.println("O cavalo " + cavalo.getNome() + 
		" está relinchando... " + cavalo.getSom());
	}
	public static void somPreguica(Animal preguica) {
		System.out.println("A preguiça " + preguica.getNome() + 
		" está... " + preguica.getSom());
	}
	
	public static void som(Animal cachorro, Animal cavalo, Animal preguica, Scanner ler) {
	
		System.out.println("\nQual animal vai emitir o som...\nescolhe aqui ↓\n"
				+ "\n[1] CACHORRO\n[2] CAVALO\n[3] PREGUIÇA");
		escolha = ler.nextInt();	
		
		if(escolha == 1) {
			somCachorro(cachorro);
		}
		else if(escolha == 2) {
			somCavalo(cavalo);
		}
		else {
			somPreguica(preguica);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
