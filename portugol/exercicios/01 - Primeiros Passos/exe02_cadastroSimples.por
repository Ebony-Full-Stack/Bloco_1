programa
{
	/*
	Faça um algoritmo que cadastre as seguintes informações 
	do usuário e em seguida exiba na tela. 
	(Nome, Sobrenome, Idade, Altura, CPF, Telefone e Email)
	*/
	
	funcao inicio()
	{
		cadeia nome, sobrenome, cpf, email, telefone
		inteiro idade
		real altura

		escreva("Olá, vamos começar... digite seu nome: ")
		leia(nome)

		escreva("Muito prazer, ", nome, ", agora, seu sobrenome: ")
		leia(sobrenome)

		escreva(nome, ", não quero ser deselegante, mas preciso saber sua idade: ")
		leia(idade)
		
		escreva("...e também sua altura no formato x.xx por favor: ")
		leia(altura)

		escreva("Estamos quase finalizando, digite seu CPF: ")
		leia(cpf)

		escreva("Agora, seu melhor telefone: ")
		leia(telefone)

		escreva("Por fim, ", nome, ", seu melhor email: ")
		leia(email)

		limpa()
		escreva("Ufa! Finalmente né, ", nome, "!!!\nVou lhe mostrar como ficou seu cadastro...")
		escreva("\n\nNome.....: ", nome, "\nSobrenome: ", sobrenome, "\nIdade....: ", idade)
		escreva("\nAltura...: ", altura, "\nCPF......: ", cpf, "\nTelefone.: ", telefone, "\nEmail....: ", email, "\n\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */