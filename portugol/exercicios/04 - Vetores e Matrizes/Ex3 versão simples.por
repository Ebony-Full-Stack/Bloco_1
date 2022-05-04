programa {
/*
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.

Autor: Leonardo Alves
*/
	funcao inicio() {

		inteiro linha, coluna, n1[4][6], n2[4][6]

		escreva("\nVamos começar pela Matriz N1\n")
		para (linha = 0; linha < 4; linha++){
			para (coluna = 0; coluna < 6; coluna++) {
				escreva ("Posição [" , linha + 1 , "][" , coluna + 1 , "]: ")
				leia (n1[linha][coluna] )
			}		
		}

		escreva("\nAgora, a Matriz N2\n")
		para (linha = 0; linha < 4; linha++){
			para (coluna = 0; coluna < 6; coluna++) {
				escreva ("Posição [" , linha + 1 , "][" , coluna + 1 , "]: ")
				leia (n2[linha][coluna] )
			}		
		}

		escreva("\n\nMatriz M2 (Soma entre N1 e N2: \n")
		para (linha = 0; linha < 4; linha++) {
			para (coluna = 0; coluna < 6; coluna++) {
				escreva("[" , (n1[linha][coluna]) + (n2[linha][coluna]) , "]")
			}
			escreva ("\n")
		}		

		escreva("\n\nMatriz M2 (Diferença entre N1 e N2: \n")
		para (linha = 0; linha < 4; linha++) {
			para (coluna = 0; coluna < 6; coluna++) {
				escreva("[" , (n1[linha][coluna]) - (n2[linha][coluna]) , "]")
			}
			escreva ("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1080; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */