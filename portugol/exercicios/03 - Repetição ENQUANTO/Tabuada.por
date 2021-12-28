programa 
{
	inclua biblioteca Util
	
	/*
	Crie um mini sistema de tabuada,
	permita que o usuário após receber o resultado,
	escolha se quiser um novo número para criação
	da tabuada. Encerre quando o usuário escolher 
	sair.

	Autor: Leonardo Alves
	*/
	
	funcao inicio() 
	{
		inteiro opc, numero, resultado, cont, contador = 0

		enquanto (contador != 2) {

			escreva("\nxxxxxxxxxxxxxxx Tabuada xxxxxxxxxxxxxxxx")	
			escreva("\nxxxxxxxxxxxx Menu Principal xxxxxxxxxxxx")
			escreva("\n\n { 1 } Criar tabuada.\n { 2 } Sair do Sistema.")
			escreva("\n\nOpção: ")
			leia(opc)

			se (opc == 1) {
				escreva("\nDigite um número: ")
				leia(numero)
		
				limpa()
			
				para (cont = 1; cont <= 10; cont++) {
					resultado = numero * cont 
					escreva (numero, " X ", cont, " = ", resultado , "\n")
				}				
			} senao se (opc == 2) {
				limpa()
				escreva("\n     ...sistema sendo encerrado...")
				Util.aguarde(3000)
				escreva("\nxxxxxxxxx Sistema encerrado! xxxxxxxxxx\n\n")	
				contador = 2
			} senao {
				limpa()
				escreva("\nOpção inválida! Tente novamente...\n")
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1100; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */