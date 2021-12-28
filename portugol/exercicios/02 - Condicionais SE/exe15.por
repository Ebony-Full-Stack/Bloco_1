programa
{
	/*
	Encontrar o dobro de um número caso ele seja positivo
	e o seu triplo caso seja negativo, imprimindo o resultado.

	Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um número: ")
		leia(numero)
		
		se (numero >= 0) {
			escreva("\nDobrando o número " + numero + " | temos: " + numero * 2, "\n\n")
		} senao {
			escreva("\nTriplicando o número " + numero + " | temos: " + numero * 3, "\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */