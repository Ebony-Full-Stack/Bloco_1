programa
{
	inclua biblioteca Matematica --> mat
	/*
	Faça um algoritmo que de forma simplória,receba o valor de 
	uma compra e em seguida permita ao usuário escolher a 
	quantidade de parcelas. 	Apresente o resultado, com o valor
	da compra e as parcelas.
	*/
	
	funcao inicio()
	{
		real valorCompra, result
		inteiro qtdParcelas

		escreva("Informe o valor da compra: ")
		leia(valorCompra)

		escreva("Informe a quantidade de parcelas: ")
		leia(qtdParcelas)

		result = valorCompra / qtdParcelas

		escreva("\nValor aproximado de cada parcela: R$", mat.arredondar(result, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */