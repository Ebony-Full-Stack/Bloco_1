programa
{
	/*
	Faça um programa que pegue um número do teclado e
	calcule a soma de todos os números de 1 até ele. 
	Ex.: o usuário entra 7, o programa vai mostrar 28, 
	pois 1+2+3+4+5+6+7=28.

	Autor: Leonardo Alves
	*/

	funcao inicio()
	{
		inteiro numero = 7, soma = numero

		faca {

			escreva(numero, " ")
			numero -= 1
			soma += numero

		} enquanto (numero > 0)

		escreva("\nSomando os valores, temos: ", soma, "\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 219; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */