package loopWhile;
import javax.swing.JOptionPane;

/*
Crie um programa que peça para 10 alunos a sua idade, 
ao final o programa deverá verificar se a média de 
idade da turma varia entre 0 e 25, 26 e 60 e maior 
que 60; e então, dizer se a turma é jovem, adulta 
ou idosa, conforme a média calculada.

Autor Leonardo Alves
*/
public class exe04media {
	public static void main(String[] args) {
		
		int[] idades = new int[10];
		int cont, soma=0;
		double media=0.0;
		String status="Ops, algo errado não está certo.";
		
		for (cont=0; cont<10;cont++) {
			idades[cont] = Integer.parseInt(JOptionPane.showInputDialog((cont+1) + "ª Aluno.\nSua idade: "));
			soma += idades[cont];
		}
		media = soma / idades.length;
		
		if (media >= 0 && media <=25) {
			status = "JOVEM.";
		} else if (media >= 26 && media <= 60) {
			status = "ADULTA.";
		} else if (media >= 60 && media <= 110) {
			status = "IDOSA.";
		}
		JOptionPane.showMessageDialog(null, "De acordo com a média de idade da turma,\n"
				+ "podemos considerá-la " + status);
	}	
}
