package exercicio01;

public class Cachorro extends Animal implements AcaoAnimal {
	
	@Override
	public void acao() {
		
		System.out.println("O cachorro saiu correndo atrás do motóca!");
		
	}
}
