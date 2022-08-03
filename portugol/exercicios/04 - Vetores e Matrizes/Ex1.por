programa {
/*
Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

Autor: Leonardo Alves
*/
	
	funcao inicio() {
		inteiro notas[5], cont, maiorN = 0

		para (cont=0;cont < 5; cont++){

			escreva("Digite a ", cont+1, "ª nota: ")
			leia(notas[cont])

			se(notas[cont] >= maiorN){
				maiorN = notas[cont]
			}
		}
		escreva("\n\nA maior nota foi a nota: ", maiorN, "!!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */