programa
{
	inclua biblioteca Matematica --> mat
	/*
	IMC = peso / ( altura )2
	Elabore um algoritmo que leia o peso e a altura de um adulto 
	e mostre sua condição de acordo com a tabela abaixo.
		IMC em adultos Condição
		Abaixo de 18,5 Abaixo do peso
		Entre 18,5 e 25 Peso normal
		Entre 25 e 30 Acima do peso
		Acima de 30 obeso

	Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		real peso, altura, imc
		cadeia resultado

		escreva("Digite seu peso: ")
		leia(peso)
		escreva("Digite sua altura: ")
		leia(altura)

		imc = peso / (altura * 2)

		se (mat.arredondar(imc, 1) < 18.5) {
			resultado = "Abaixo do peso"
		
		} senao se (mat.arredondar(imc, 1) >= 18.5 e mat.arredondar(imc, 1) < 25) {
			resultado = "Peso normal"
		
		} senao se (mat.arredondar(imc, 1) >= 25 e mat.arredondar(imc, 1) < 30) {
			resultado = "Acima do peso"
		
		} senao se (mat.arredondar(imc, 1) >= 30) {
			resultado = "Obeso"
		
		} senao {
			resultado = "Parece que você informou um valor negativo"
		}

		limpa()
		escreva("\n^^^^^^^^^^^^^ IMC ^^^^^^^^^^^^^")
		escreva("\n Resultado.: ", mat.arredondar(imc, 1))
		escreva("\n Situação..: ", resultado, "\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1044; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */