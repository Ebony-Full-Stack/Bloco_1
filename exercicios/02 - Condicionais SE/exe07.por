programa
{
	inclua biblioteca Matematica --> mat
	/*
		Receber valores de base e altura de um triângulo 
		e verificar se são valores válidos 
		(positivos maiores que zero). Em caso afirmativo, 
		calcular a área do triângulo.

		Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		real base, altura, area

		escreva("Digite uma medida para base: ")
		leia(base)
		escreva("Digite uma medida para altura: ")
		leia(altura)

		area = (base * altura) / 2

		se (base > 0 e altura > 0) {
			escreva("\nÁrea deste triângulo: ", mat.arredondar(area, 1), "\n\n")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */