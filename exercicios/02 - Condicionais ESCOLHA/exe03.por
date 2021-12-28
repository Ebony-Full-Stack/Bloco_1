programa
{
	inclua biblioteca Matematica --> mat
	
	/*
	Crie um sistema que calcule a média de 4 notas, ao fim, gere uma mensagem 
	personalizada de acordo com a media final do usuário. 
	A - (9 - 10).....Parabéns, (nome)! você foi super bem!!!
	B - (7 - 8,9)....Parabéns, (nome)! você ainda pode melhorar, mas foi bem.
	C - (5 - 6,9)....(nome,), precisamos melhorar em alguns pontos na próxima.
	D - (4,5 - 4,9)..(nome), preciso conversar com seus pais...
	F - (0 - 4,4)....(nome), seus pais precisar vir ainda hoje!!!

	Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		caracter media
		cadeia nome, msg
		real nota1, nota2, nota3, nota4, calc
		
		escreva("\nNome: ")
		leia(nome)
		escreva(" 1ª Nota: ")
		leia(nota1)
		escreva(" 2ª Nota: ")
		leia(nota2)
		escreva(" 3ª Nota: ")
		leia(nota3)
		escreva(" 4ª Nota: ")
		leia(nota4)

		se (nota1 >= 0 e nota1 <= 10 e nota2 >= 0 e nota2 <= 10 e
		    nota3 >= 0 e nota3 <= 10 e nota4 >= 0 e nota4 <= 10) {

			calc = (nota1 + nota2 + nota3 + nota4) / 4

			se (calc >= 9 e calc <= 10){
				media = 'A'
			} senao se (calc >= 7 e calc <= 8.9) {
				media = 'B'
			} senao se (calc >= 5 e calc <= 6.9) {
				media = 'C'
			} senao se (calc >= 4.5 e calc <= 4.9) {
				media = 'D'
			} senao se (calc >= 0 e calc <= 4.4) {
				media = 'F'
			} senao {
				media = 'O'
			}
	
			escolha (media) {
				caso 'A':
					msg = "\nParabéns, " + nome + "! Você foi super bem!!!\n\n"
					pare
				caso 'B':
					msg = "\nParabéns, " + nome + "! Você ainda pode melhorar, mas foi bem.\n\n"
					pare
				caso 'C':
					msg = "\n" + nome + ", precisamos melhorar em alguns pontos na próxima.\n\n"
					pare
				caso 'D':
					msg = "\n" + nome + ", preciso conversar com seus pais...\n\n"
					pare
				caso 'F':
					msg = "\n" + nome + ", seus pais precisam vir ainda hoje!!!\n\n"
					pare
				caso contrario:
					msg = "\nAlgo errado não está certo, tente novamente em instantes...\n\n"		
			}

			escreva("\n\n_________________________________________")
			escreva("\n----------| Dados cadastrados |----------\n")
			escreva("\n Nome: ", nome, "\n Média calculada: ", mat.arredondar(calc, 1))
			escreva("\n Média final: ", media, "\n" + msg)
				
		}senao {
			escreva("\nOps, uma ou mais notas está/estão fora do padrão.\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1831; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */