programa
{
	/*
	Faça um algoritmo que leia dois valores inteiros A e B 
	se os valores forem iguais deverá se somar os dois, 
	caso contrário multiplique A por B. Ao final de 
	qualquer um dos cálculos deve-se atribuir o resultado 
	para uma variável C e mostrar seu conteúdo na tela.
	
	Autor: Leonardo Alves
	*/

	funcao inicio()
	{
		inteiro a, b, c
		cadeia operacao

		escreva("Digite um valor para [A]: ")
		leia(a)
		escreva("Digite um valor para [B]: ")
		leia(b)

		se (a == b) {
			c = a + b
			operacao = "\nSomando "
		} senao {
			c = a * b
			operacao = "\nMultiplicando "
		}
		
		escreva(operacao , a , " e ", b , " | temos: ", c, "\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */