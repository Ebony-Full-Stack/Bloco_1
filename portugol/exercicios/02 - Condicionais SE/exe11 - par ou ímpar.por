programa
{
	/*
	Faça um algoritmo para receber um número qualquer 
	e informar na tela se é par ou ímpar.
	*/
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um número: ")
		leia(numero)
		
		se (numero % 2 == 0) {

			escreva("\nO número " + numero + " é par!\n\n")
			
		} senao {

			escreva("\nO número " + numero + " é ímpar!\n\n")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */