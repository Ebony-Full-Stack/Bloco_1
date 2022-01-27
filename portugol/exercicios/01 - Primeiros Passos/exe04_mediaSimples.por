programa
{
	/*
	Faça um algoritmo que solicite o nome do aluno, 
	em seguida suas 3 notas e calcule sua média. 
	Ao fim apresente as informações na tela.
	*/

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		cadeia nome
		real nota1, nota2, nota3, media

		escreva("Nome: ")
		leia(nome)

		escreva("Agora vamos cadastrar as 3 notas: ↓\n")
		leia(nota1, nota2, nota3)

		media = (nota1 + nota2 + nota3) / 3

		escreva("\nMédia calculada: ", mat.arredondar(media, 1), "\n\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 485; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */