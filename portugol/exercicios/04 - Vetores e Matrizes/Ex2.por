programa {
/*
Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.

Autor: Leonardo Alves
*/

	inclua biblioteca Util --> u
	
	funcao inicio() {
		
		inteiro cont, dado[10], soma = 0, maior = 0
		real media

		escreva("Sortendo: ")
		
		para(cont = 0; cont < 10; cont++){

			dado[cont] = u.sorteia(1, 6)
			soma += dado[cont]

			se(dado[cont] == 6) {
				maior++
			}
			escreva(dado[cont] + " | ")
			u.aguarde(500)
		}
		
		media = soma/cont
		
		escreva("\n\nMédia aritmética dos lançamentos: ", media, 
		"\nOcorrências da maior pontuação: ", maior, "\n\n") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 557; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */