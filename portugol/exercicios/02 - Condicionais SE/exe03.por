programa
{
	inclua biblioteca Matematica --> mat
	/*
		Desenvolva um sistema em que:
•		Leia 4 (quatro) números;
•		Calcule o quadrado de cada um;
•		Se o valor resultante do quadrado do terceiro for >= 1000, 
		imprima-o e finalize; Caso contrário, imprima os valores 
		lidos e seus respectivos quadrados.

		Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		inteiro n1, n2, n3, n4

		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o terceiro número: ")
		leia(n3)
		escreva("Digite o quarto número: ")
		leia(n4)

		se ((mat.potencia(n3, 2.0)) >= 1000) {
			escreva("\n\n" + n3 + " elevado ao quadrado, temos: ", 
			mat.potencia(n3, 2.0), "\n\n")
			
		} senao {
			escreva("\n\n" + n1 + " elevado ao quadrado, temos: ", 
			mat.potencia(n1, 2.0))

			escreva("\n" + n2 + " elevado ao quadrado, temos: ", 
			mat.potencia(n2, 2.0))

			escreva("\n" + n3 + " elevado ao quadrado, temos: ", 
			mat.potencia(n3, 2.0))

			escreva("\n" + n4 + " elevado ao quadrado, temos: ", 
			mat.potencia(n4, 2.0), "\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */