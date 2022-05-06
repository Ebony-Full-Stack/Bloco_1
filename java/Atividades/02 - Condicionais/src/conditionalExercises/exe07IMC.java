package conditionalExercises;
import java.util.Scanner;

/*
Crie um sistema para calcular o IMC do usuário, considere:
Obesidade grau III   ==>  Acima de 40
Obesidade grau II    ==>  Entre 35 e 40 
Obesidade grau I     ==>  Entre 30 e 34.9
Acima do peso        ==>  Entre 25 e 29.9
Peso Nomal           ==>  Entre 18.5 e 24.9
Abaixo do peso       ==>  Entre 17 e 18.4
Muito abaixo do peso ==> Entre 16 e 16.9

Autor: Leonardo Alves
*/

public class exe07IMC {
	public static void main(String[] args) {
		
		double altura, peso, imc;
		String resultado;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("\nDigite sua altura: ");
		altura = ler.nextDouble();
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		imc = peso / (altura * 2);
		
		if (imc >= 16) {
			
			if (imc > 40) {
				resultado = "OBESIDADE GRAU III";
			
			} else if (imc >= 35 && imc < 40) {
				resultado = "OBESIDADE GRAU II";
			
			} else if (imc >= 30 && imc < 35) {
				resultado = "OBESIDADE GRAU I";
				
			} else if (imc >= 25 && imc < 30) {
				resultado = "ACIMA DO PESO";
				
			} else if (imc >= 18.5 && imc < 25) {
				resultado = "PESO NORMAL";
				
			} else if (imc >= 17 && imc < 18.5) {
				resultado = "ABAIXO DO PESO";
			
			} else if (imc >= 16 && imc < 17) {
				resultado = "MUITO ABAIXO DO PESO";
			
			System.out.printf("\nCom IMC: %.1f", imc);
			System.out.println("\nSituação: " + resultado);	
			} 
		
		}else {
			System.out.println("\nOps, algo errado não está certo!");
		}
		
		ler.close();
	}
}

















