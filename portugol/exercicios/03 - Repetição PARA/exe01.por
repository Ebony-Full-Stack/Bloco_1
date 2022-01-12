programa
{
	inclua biblioteca Matematica --> mat
	/*
	A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
	coletando dados sobre o salário e número de filhos. 
	A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$1000,00.  

	Autor: Leonardo Alves
	*/
	
	funcao inicio()
	{
		inteiro contador, filhos, totalFilhos = 0, totalSalario1k = 0, percentual = 0
		real salario, totalSalario = 0.0, maiorSalario = 0.0, mediaSalario = 0.0

		para (contador = 0; contador < 4; contador++) {

			escreva("\n♦♦♦♦♦♦♦♦♦♦♦ Bem Vindes ♦♦♦♦♦♦♦♦♦♦♦\n\n")
			escreva(contador+1,"ª Pessoa:")
			escreva("\nInforme seu salário: ")
			leia(salario)			
			escreva("Informe quantos filhos: ")
			leia(filhos)

			se (salario > maiorSalario) { 
				maiorSalario = salario
			}

			se (salario <= 1000) {
				totalSalario1k += 1
			}

			// totalSalario = totalSalario + salario
			totalSalario += salario
			totalFilhos += filhos
			percentual = (totalSalario1k*100) / 4
			mediaSalario = totalSalario/4
		}
	
		escreva("\n\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦ Relatório ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦\n")
		escreva("\n Maior salário.......................: R$ ", mat.arredondar(maiorSalario, 2))
		escreva("\n Salário médio da População..........: R$ ", mat.arredondar(mediaSalario, 2))
		escreva("\n Quantidade média de filhos..........: ", mat.arredondar(totalFilhos/4, 1))
		escreva("\n Percentual com salário até R$1000...: ", percentual, "%\n\n")
	}
}
