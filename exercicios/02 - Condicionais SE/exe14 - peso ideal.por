programa
{
	inclua biblioteca Matematica --> m
	inclua biblioteca Texto --> t
	/*
	Tendo como dados de entrada a altura e o sexo de uma pessoa, 
	construa um algoritmo que calcule seu peso ideal, utilizando 
	as seguintes fórmulas:
		● para homens: (72.7 * a) – 58;
		● para mulheres: (62.1 * a) – 44.7.
	
	Autor Leonardo Alves
	*/
	
	funcao inicio()
	{
		real altura, calc = 0.0
		cadeia sexo

		escreva("Digite sua altura: ")
		leia(altura)
		escreva("Digite seu sexo: ")
		leia(sexo)

		
		t.caixa_baixa(sexo)
		se (t.caixa_baixa(sexo) == "m" ou t.caixa_baixa(sexo) == "masculino") {
			calc = (72.7 * altura) - 58
			
		} senao se (t.caixa_baixa(sexo) == "f" ou t.caixa_baixa(sexo) == "feminino") {
			calc = (62.1 * altura) - 44.7
			
		} 

		calc = m.arredondar(calc, 1)		
		escreva("\nSeu peso ideal é: ", calc, " Kg \n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 749; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */