programa
{
	/*
	Mini sistema de login, validando usuario e senha.

	Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		cadeia senha, senhacadastrada, usuario, usuariocadastrado

		escreva("\nCadastre seu nome de usuário: ")
		leia(usuariocadastrado)
		escreva("Cadastre sua senha: ")
		leia(senhacadastrada)
		limpa()
		
		faca{
			limpa()
			escreva("\n<>>>>>>>>>>>>>>>>>><> LOGIN <><<<<<<<<<<<<<<<<<<>\n")
			escreva("\nInforme seu nome de usuário: ")
			leia(usuario)
			escreva ("Informe sua senha: ")
			leia (senha)
		}
		enquanto (senha != senhacadastrada ou usuario != usuariocadastrado)	
			limpa()	
			escreva ("\nAceso permitido!!!\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 66; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */