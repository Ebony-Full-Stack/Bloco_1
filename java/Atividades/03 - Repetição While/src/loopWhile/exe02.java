package loopWhile;
import javax.swing.JOptionPane;

/*
Uma empresa desenvolveu uma pesquisa para saber as 
características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, 
sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, 
se a pessoa era agressiva). Pede-se para elaborar um sistema 
que permita ler os dados de 5 pessoas, calcule e mostre: (WHILE)

	o número de pessoas calmas; 
	o número de mulheres nervosas; 
	o número de homens agressivos; 
	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos; 
	o número de pessoas calmas com menos de 18 anos.

Autor => Leonardo Alves
*/

public class exe02 {
	public static void main(String[] args) throws InterruptedException {
		int idade, sexo, opc, qtd=1, pcalma=0, mnervosa=0, hagressiva=0, ocalma=0; 
		int nervosa40=0, calma18=0, qtdg=0;
			
		while (qtd <= 2) {
			qtdg++;
			idade = Integer.parseInt(JOptionPane.showInputDialog(qtdg + "ª Pessoa \nPor favor, digite sua idade:"));
			
			sexo = Integer.parseInt(JOptionPane.showInputDialog("Sexo: "
					+ "\n{ 1 } Feminino\n{ 2 } Masculino\n{ 3 } Outro"));
						
			opc = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA APENAS UMA OPÇÃO\n"
					+ "{ 1 } Você se considera uma pessoa CALMA\n"
					+ "{ 2 } Você se considera uma pessoa NERVOSA\n"
					+ "{ 3 } Você se considera uma pessoa AGRESSIVA"));
			
			if (opc == 1) {
				pcalma++;
			}
			if (sexo == 1 && opc == 2) {
				mnervosa++;
			} else if (sexo == 2 && opc == 3) {
				hagressiva++;
			} else if (sexo == 3 && opc == 1) {
				ocalma++;
			} 
			if (idade > 40 && opc == 2) {
				nervosa40++;
			} else if (idade < 18 && opc == 1) {
				calma18++;
			}
			qtd++;
		}
		JOptionPane.showMessageDialog(null, 
				"Total de PESSOAS CALMAS........................: " + pcalma +
				"\nTotal de MULHERES NERVOSAS...............: " + mnervosa +
				"\nTotal de HOMENS AGRESSIVOS................: " + hagressiva +
				"\nTotal de OUTROS CALMOS.........................: " + ocalma +
				"\nTotal de PESSOAS NERVOSAS COM +40..: " + nervosa40 +
				"\nTotal de PESSOAS CALMAS COM -18........: " + calma18,
				"RELATÓRIO", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}











