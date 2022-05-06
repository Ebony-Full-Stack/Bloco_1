package loopWhile;
import javax.swing.JOptionPane;

/*
Crie um programa de operações matemáticas, 
ele deve receber 2 valores informados pelo 
usuário e um menu com opções, onde o usuário 
possa escolher: Somar, subtrair, dividir, 
multiplicar e sair.

Autor Leonardo Alves
*/

public class exe03calculadoraSimples {
	public static void main(String[] args) {
		int n1, n2, opc, resultado=0;

		while (true) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA APENAS UMA OPÇÃO!\n"
					+ "1 | SOMAR\n2 | SUBTRAIR\n3 | DIVIDIR\n4 | MULTIPLICAR\n5 | SAIR\n\nOPÇÃO: "));
			
			if (opc == 5) {
				break;
			} else if (opc <= 0 || opc > 5) {
				JOptionPane.showMessageDialog(null, "Ops, parece que você inseriu um dado inválido!\n"
						+ "Tecle ENTER ou clique em OK para tentar novamente.", "Burrãooo!!!"
						, JOptionPane.INFORMATION_MESSAGE);
			} else {
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
			
				switch(opc) {
				case 1:
					resultado = n1 + n2;
					break;
				case 2:
					resultado = n1 - n2;
					break;
				case 3:
					resultado = n1 / n2;
					break;
				case 4:
					resultado = n1 * n2;
					break;				
				}
				JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "@ebony.programador",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}












