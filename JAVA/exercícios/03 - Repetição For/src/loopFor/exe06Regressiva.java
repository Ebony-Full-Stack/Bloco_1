package loopFor;

/*
Fa�a um programa que monstre uma contagem regressiva 
de 10 a� 0, com pausa de 2 segundos. Utilize a fun��o 
sleep para isto.

Autor => Leonardo Alves
*/

public class exe06Regressiva {
	public static void main(String[] args) {
		for (int cont = 10; cont >= 0; cont--) {
			
			try {Thread.sleep(2000);		
			} catch (Exception erro) {}
			
			System.out.println(cont);
		}
	}
}
