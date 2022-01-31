package loopWhile;
import javax.swing.JOptionPane;

/*
Solicitar a idade de várias pessoas e imprimir: 
Total de pessoas com menos de 21 anos. Total de 
pessoas com mais de 50 anos. O programa termina 
quando idade for =-99. (WHILE)

Autor: Leonardo Alves
*/

public class exe01 {
	public static void main(String[] args) {
		int idade=0, soma21=0, soma50=0, qtd=0;
		
		while (idade != -99) {
			qtd++;
			idade = Integer.parseInt(JOptionPane.showInputDialog(
					qtd + "ª Pessoa | Digite sua idade ou [-99] para encerrar: "));
					
			if (idade < 21 && idade != -99) {
				soma21++;
			}
			if (idade > 50) {
				soma50++;
			}
		}
		JOptionPane.showMessageDialog(null, 
				"Total de pessoas com menos de 21 anos: " + soma21 + 
				"\nTotal de pessoas com mais de 50 anos: "+ soma50,
				"@ebony.programador", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
