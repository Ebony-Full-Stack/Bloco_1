package primeirosPassos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

/*
Implemente um programa em Java que leia as coordenadas de dois
pontos e calcule a distância entre eles. Lembre-se que a distância 
entre dois pontos é dada pela seguinte equação: Utilize as funções 
sqrt e pow da classe Math para calcular a raiz quadrada e elevar os 
números as suas devidas potencias.  

Autor: Leonardo Alves
*/

public class exe01_versão2 {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dtConvertida, dtAtual;
		String dtEntrada, dtFormat;
		long diasVividos;
		
		System.out.print("Vamos começar, digite sua data de nascimento dd/mm/aaaa: ");
		dtEntrada = ler.next();
		
		try {
			dtConvertida = data.parse(dtEntrada);
			dtFormat = data.format(dtConvertida);
			System.out.println("Data inserida: " + dtFormat);
			
			dtAtual = Calendar.getInstance().getTime();
			System.out.println("Data de hoje: " + data.format(dtAtual));
			
			diasVividos = (dtAtual.getTime() - dtConvertida.getTime());
			System.out.println("\nAté aqui, você viveu um total de " + diasVividos/86400000L + " dias.");
		}
		catch (ParseException e) {
			System.err.println("Ops, parece que vc inseriu uma data inválida!");
		}
		ler.close();
	}
}
