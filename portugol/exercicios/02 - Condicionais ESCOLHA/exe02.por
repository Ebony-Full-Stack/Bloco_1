programa
{
	inclua biblioteca Util
	
	/*
	Crie um mini cadastro, solicite nome, email,	telefone do usuário, permita que o mesmo
	escolha se quer cadastrar ou mostrar os dados cadastrados em forma de relatório. Caso a opção
	Imprimir seja escolhida primeiro, informe ao usuário que ainda não temos dados para impressão.
	Ao escolher a opção cadastrar, solicite as informações	e em seguida apresente o relatório. 

	Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		inteiro opc
		cadeia nome = "", email = "", tel = ""
		
		escreva("••••••••• Menu Principal •••••••••")
		escreva("\n 1 • Cadastrar\n 2 • Imprimir")
		escreva("\n\nOpção: ")
		leia(opc)

		se (opc == 1 ou opc == 2) {
			se (opc == 2 e nome == "") {
				escreva("\nOps, ainda não temos informações para impressão.\n\n")
			} senao {
				escolha (opc) {
					caso 1:
						escreva("\nOk... vamos iniciar seu cadastro.")
						escreva("\nDigite seu nome: ")
						leia(nome)
						escreva("Agora, seu melhor email: ")
						leia(email)
						escreva("Por fim, seu telefone: ")
						leia(tel)
		
					caso 2:
						escreva("\n\n...seus dados serão impressos em instantes")
						Util.aguarde(3000)
						escreva("\n\n••••••••••••••••••••••••••••••")
						escreva("\n Nome: ", nome, "\n Email: ", email, "\n Telefone: ", tel)
						escreva("\n••••••••••••••••••••••••••••••\n\n")	
				}
			}
		} senao {
			escreva("\nOps, opção inválida!\n\n")
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */