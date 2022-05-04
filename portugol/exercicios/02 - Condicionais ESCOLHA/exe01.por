programa {
/*
Crie um sistema que permita ao usuário escolher 2 números e apresente um menu
com as opções: Somar, Subtrair, Multiplicar e Dividir

Autor: Leonardo Alves
*/
	
	funcao inicio() {
		inteiro opc, n1, n2, resultado = 0
	
		escreva("|=== MENU PRINCIPAL ===|")
		escreva("\n  [ 1 ] SOMAR\n  [ 2 ] SUBTRAIR\n  [ 3 ] MULTIPLICAR\n  [ 4 ] DIVIDIR\n")
		escreva("\nOpção: ")
		leia(opc)


		se (opc >= 1 e opc <= 4) {

			escreva("\nDigite o primeiro número: ")
			leia(n1)
			escreva("Digite o segundo número: ")
			leia(n2)
					
			escolha (opc) {
				caso 1:
					resultado = n1 + n2
					pare
				caso 2:
					resultado = n1 - n2
					pare
				caso 3:
					resultado = n1 * n2
					pare
				caso 4:
					resultado = n1 / n2
					pare				
			}
			
			escreva("\nResultado: ", resultado, "\n\n")	
			
		} 
		senao {
			escreva("\nOps, parece que você escolheu uma opção inválida...\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */