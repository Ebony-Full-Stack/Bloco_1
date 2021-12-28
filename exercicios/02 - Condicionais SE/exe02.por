programa
{
	/*
		Elabore um sistema que leia as variáveis C e N, 
		respectivamente código e número de horas trabalhadas 
		de um operário. E calcule o salário sabendo-se que ele 
		ganha R$ 10,00 por hora. Quando o número de horas exceder 
		a 50 calcule o excesso de pagamento armazenando-o na 
		variável E, caso contrário zerar tal variável. A hora 
		excedente de trabalho vale R$ 20,00. No final do 
		processamento imprimir o salário total e o salário excedente.

		Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		inteiro codigo
		real horasTrabalhadas, horasExtras = 0.0, salario = 0.0, salarioExtra = 0.0

		escreva("Digite seu código: ")
		leia(codigo)
		escreva("Total de horas de trabalhadas: ")
		leia(horasTrabalhadas)

		se (horasTrabalhadas > 50) {
			horasExtras = horasTrabalhadas - 50
		}

		salarioExtra = horasExtras * 20.0
		salario = (horasTrabalhadas - horasExtras) * 10.0

		escreva("\n\n|-================================-|")
		escreva("\n Total de horas trabalhadas: ", horasTrabalhadas)
		escreva("\n Total de horas extras: ", horasExtras)
		escreva("\n Salário extra: R$ ", salarioExtra)
		escreva("\n Salário base: R$ ", salario)
		escreva("\n------------------------------------")
		escreva("\n Salário: R$", salario + salarioExtra)
		escreva("\n|-================================-|\n\n")












		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */