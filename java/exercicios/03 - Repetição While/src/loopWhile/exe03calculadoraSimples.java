package loopWhile;
import javax.swing.JOptionPane;

/*
Crie um programa de opera��es matem�ticas, 
ele deve receber 2 valores informados pelo 
usu�rio e um menu com op��es, onde o usu�rio 
possa escolher: Somar, subtrair, dividir, 
multiplicar e sair.

Autor Leonardo Alves
*/

public class exe03calculadoraSimples {
	public static void main(String[] args) {
		int n1, n2, opc, resultado=0;

		while (true) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA APENAS UMA OP��O!\n"
					+ "1 | SOMAR\n2 | SUBTRAIR\n3 | DIVIDIR\n4 | MULTIPLICAR\n5 | SAIR\n\nOP��O: "));
			
			if (opc == 5) {
				break;
			} else if (opc <= 0 || opc > 5) {
				JOptionPane.showMessageDialog(null, "Ops, parece que voc� inseriu um dado inv�lido!\n"
						+ "Tecle ENTER ou clique em OK para tentar novamente.", "Burr�ooo!!!"
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












