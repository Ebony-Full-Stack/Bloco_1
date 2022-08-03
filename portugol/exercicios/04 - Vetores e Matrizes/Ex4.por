programa {
/*
Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.

Autor: Leonardo Alves
*/	
	
	funcao inicio()
	{
		inteiro n[3][3], linha, coluna, soma = 0, somaP = 0

		para(linha = 0; linha <3; linha++){
		
			para(coluna = 0; coluna < 3; coluna++){
				escreva("Digite os números da matriz | Posição [" + linha + ":" + coluna + "]: ")
				leia(n[linha][coluna])

				soma+= n[linha][coluna]
			}
			limpa()
		}

		escreva("Sua matriz ficou assim: \n")
		
		para(linha = 0; linha < 3; linha++){

			para(coluna = 0; coluna < 3; coluna++){
				escreva("[ ", n[linha][coluna]," ]")
			}
			escreva("\n")
		}

		somaP = n[0][0] + n[1][1] + n[2][2]

		escreva("\nSomando os números da matriz: ", soma, "\n",
		"Somando a diagonal principal: ", somaP, "\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 861; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */