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
		
		inteiro cont, contm = 0, dado[10], soma = 0, maior = 0, tmaior = 0
		real media
		logico status=falso

		escreva("Sortendo: ")
		
		para(cont = 0; cont < 10; cont++){

			dado[cont] = u.sorteia(1, 6)
			soma += dado[cont]

			se(dado[cont] == 6) {
				maior++
				tmaior++
				status = verdadeiro
			}
			se(maior <= dado[cont]) {
				maior = dado[cont]
			}
			
			escreva(dado[cont] + " | ")
			u.aguarde(500)
		}
		para(cont = 0; cont < 10; cont++) {
			se(maior == dado[cont]) {
				contm++
			}
		}
		
		media = soma/cont
		
		escreva("\n\nMédia aritmética dos lançamentos: ", media) 
		se(status == verdadeiro) {
			escreva("\nOcorrências da maior pontuação [6]: ", tmaior, "\n\n")
		}
		senao {
			escreva("\nOcorrências da maior pontuação [6]: ", contm, "\n\n")
		}
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 909; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */