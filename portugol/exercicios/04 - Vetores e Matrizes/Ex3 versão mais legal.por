programa {
/*
Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.

Autor: Leonard Alves
*/	

	inclua biblioteca Util
	
	funcao inicio(){
	
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6]
		
		criaArray(n1, n2)
		criaArraySoma(m1,n1,n2)
		criaArrayDiferenca(m2,n1,n2)
		escreveArray(n1,n2,m1,m2)
	}

	funcao criaArray(inteiro n1[][], inteiro n2[][]){
		inteiro linha, coluna

		para(linha = 0; linha <4; linha++){
			para(coluna = 0; coluna< 6; coluna++){

				n1[linha][coluna] = Util.sorteia(0, 50)
				n2[linha][coluna] = Util.sorteia(0, 50)
				
			}
		}
	}	

	funcao criaArraySoma(inteiro m1[][], inteiro n1[][], inteiro n2[][]){
		inteiro linha, coluna
	
		para (linha = 0; linha < 4; linha++){
			para (coluna = 0; coluna <6; coluna++){
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
			}
		}	
	}

	funcao criaArrayDiferenca(inteiro m2[][], inteiro n1[][], inteiro n2[][]){
		inteiro linha, coluna

		para (linha = 0; linha < 4; linha++){
			para (coluna = 0; coluna <6; coluna++){
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]
			}
		}
	}

	funcao escreveArray(inteiro n1[][], inteiro n2[][], inteiro m1[][], inteiro m2[][]){

		inteiro linha, coluna, cont=1


		escreva("\nPopulando a Matriz N1\n\n")
		para(linha = 0; linha <4; linha++){
			para(coluna = 0; coluna <6; coluna++){
				escreva("[",n1[linha][coluna],"]")
				Util.aguarde(400)
			}
			escreva("\n")
		}
		escreva("\n")


		escreva("\nPopulando a Matriz N2\n\n")
		para(linha = 0; linha <4; linha++){
			para(coluna = 0; coluna <6; coluna++){
				escreva("[",n2[linha][coluna],"]")
				Util.aguarde(400)
			}
			escreva("\n")
		}
		escreva("\n")

		escreva("\nAguarde enquanto calculamos os valores para Matriz M1\n")
		Util.aguarde(4000)
		escreva("Populando a Matriz M1\n\n")
		Util.aguarde(1000)
		para(linha = 0; linha <4; linha++){
			para(coluna = 0; coluna <6; coluna++){
				escreva("[",m1[linha][coluna],"]")
				Util.aguarde(300)
			}
			escreva("\n")
		}
		escreva("\n")

		escreva("\nAguarde enquanto calculamos os valores para Matriz M2\n")
		Util.aguarde(4000)
		escreva("Populando a Matriz M2\n\n")
		Util.aguarde(1000)
		para(linha = 0; linha <4; linha++){
			para(coluna = 0; coluna <6; coluna++){
				escreva("[",m2[linha][coluna],"]")
				Util.aguarde(300)
			}
			escreva("\n")
		}
	}
}

	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */