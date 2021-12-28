programa
{
	/*
		João, homem de bem, comprou um microcomputador para controlar 
		o rendimento diário de seu trabalho. Toda vez que ele traz um 
		peso de tomate maior que o estabelecido pelo regulamento do 
		estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 
		por quilo excedente. João precisa que você faça um sistema que 
		leia a variável P (peso de tomates) e verifique se há excesso. 
		Se houver, gravar na variável E (Excesso) e na variável M o 
		valor da multa que João deverá pagar. Caso contrário mostrar 
		tais variáveis com o conteúdo ZERO.

		Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		real peso, excesso, valorExcedente

		escreva("João, informe o peso: ")
		leia(peso)

		se (peso > 50.0) {
			excesso = peso - 50.0
			valorExcedente = excesso * 4.0
		} senao {
			excesso = 0.0 
			valorExcedente = 0.0
		}

		escreva("\n================================")
		escreva("\n Peso total de tomates: Kg ", peso)
		escreva("\n Peso excedente: Kg ", excesso)
		escreva("\n Valor da multa: R$ ", valorExcedente)
		escreva("\n================================")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1099; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */