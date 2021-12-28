programa
{
	/*
		Elabore um sistema que dada a idade de um nadador 
		classifique-o em uma das seguintes categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos

		Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
	 	inteiro idade
	 	cadeia categoria

	 	escreva("Digite sua idade: ")
	 	leia(idade)

	 	se (idade >= 5 e idade <= 7) {
	 		categoria = "Infantil A\n\n"
	 	} senao se (idade >= 8 e idade <= 11) {
	 		categoria = "Infantil B\n\n"
	 	} senao se (idade >= 12 e idade <= 13) {
	 		categoria = "Juvenil A\n\n"
	 	} senao se (idade >= 14 e idade <= 17) {
	 		categoria = "Juvenil B\n\n"
	 	} senao se (idade >= 18) {
	 		categoria = "Adulto\n\n"
	 	} senao {
	 		categoria = "Desculpe, não foi possível incluir em uma categoria com a idade informada.\n\n"
	 	}	
	 	
	 	escreva("\nCategoria: ", categoria)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */