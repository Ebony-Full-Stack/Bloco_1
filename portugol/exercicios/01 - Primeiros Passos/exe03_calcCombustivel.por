programa
{
	/*
	Faça um algoritmo para determinar quanto de combustível será 
	gasto em uma viagem de acordo com o km informado pelo usuário. 
	Considere: Valor do combustível R$2.50 o litro, sendo necessário
	0.5 litro para cada km percorrido.
	*/
	
	funcao inicio()
	{
		real litro=2.50, distancia

		escreva("Informe a distância: ")
		leia(distancia)

		escreva("\nLitros: ", distancia / 2)
		escreva("\nValor.: R$", (distancia / 2) * litro, "\n\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */