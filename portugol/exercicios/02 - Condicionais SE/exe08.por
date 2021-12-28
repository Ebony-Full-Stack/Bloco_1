programa
{
	
	/*
		Construa um sistema para ler uma variável 
		numérica N e imprimi-la somente se a mesma 
		for maior que 100, caso contrário 
		imprimi-la com o valor zero.

		Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		se (numero > 100) {
			escreva("\nValor inserido: ", numero, "\n\n")
		} senao {
			escreva("\nValor informado: 0\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */