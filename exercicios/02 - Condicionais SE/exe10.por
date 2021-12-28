programa
{
	inclua biblioteca Texto --> t
	/*
	Faça um algoritmo que leia o nome, o sexo e o estado civil 
	de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, 
	solicitar o tempo de casada (anos).

	Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		cadeia nome, sexo, estadoCivil
		inteiro tempo

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite seu sexo [F, M, O]: ")
		leia(sexo)
		sexo = t.caixa_alta(sexo)
		escreva("Digite seu estado cívil [C, S, D]: ")
		leia(estadoCivil)
		estadoCivil = t.caixa_alta(estadoCivil)
		
		se (sexo == "F" e estadoCivil == "C") {
			escreva("\nDigite a quanto tempo está casada: ")
			leia(tempo)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */