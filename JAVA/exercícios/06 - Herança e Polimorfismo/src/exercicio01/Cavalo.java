package exercicio01;

public class Cavalo extends Animal implements AcaoAnimal {

	@Override
	public void acao() {
		
		System.out.println("O cavalo est� dando uns trotes ali...");
	}
}
