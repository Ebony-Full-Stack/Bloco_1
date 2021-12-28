programa
{
	/*
	Desenvolver um sistema que efetue a soma de todos os números 
	ímpares que são  múltiplos de três e que se encontram no 
	conjunto dos números de 1 até 500
	
	Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		inteiro numero, soma = 0

		para (numero = 1; numero < 500; numero+=2) {

			se (numero % 3 == 0) {
				soma += numero
			}
		}
		escreva("\nTotal: ", soma, "\n\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */