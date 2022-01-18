programa {	
	/*
	Faça um sistema que leia a data de nascimento de uma pessoa expressa 
	em anos, meses e dias e mostre-a expressa apenas em dias. 
	*/

	inclua biblioteca Calendario --> cdr
	inclua biblioteca Util
	
	funcao inteiro biss(inteiro ano) {  // verificando se o ano é bissexto
		se (ano % 400 == 0 ou ano % 4 == 0 e ano % 100 != 0) {
			retorne 1
		}
		senao {
			retorne 0
		}
	}
	
	funcao inteiro validarDt(inteiro dia, inteiro mes, inteiro ano) {
		se (ano < 0 ou mes > 31 ou mes < 1 ou dia > 31 ou dia < 1) {
			retorne 0
		}
		senao se (dia == 31 e (mes == 4 ou mes == 6 ou mes == 9 ou mes == 11)) {
			retorne 0
		}
		senao se (dia > 29 e mes == 2) { //29 por conta do ano bissexto 
			retorne 0 
		}
		senao se(mes == 2 e dia == 29 e biss(ano) == 0) {
			retorne 0
		}
		senao {
			retorne 1 
		}
	}

	funcao inteiro diasMes(inteiro mes, inteiro ano) {
		se(mes==12 ou mes==10 ou mes==8 ou mes==7 ou mes==5 ou mes==3 ou mes==1) {
			retorne 31
		}
		senao {
			se(mes == 11 ou mes == 9 ou mes == 6 ou mes == 4){
				retorne 30
			}
			senao { 
				se(biss(ano) == 1) {
					retorne 29
				}
				senao {
					retorne 28
				}
			}
		}
	}

	funcao calcIdade(inteiro diaNasc, inteiro mesNasc, inteiro anoNasc) {
		inteiro diaAtual, mesAtual, anoAtual, qtdAno = 0, qtdMes = 0, qtdDia = 0

		diaAtual = cdr.dia_mes_atual()
		mesAtual = cdr.mes_atual()
		anoAtual = cdr.ano_atual()

		 enquanto(mesNasc < mesAtual -1 ou anoNasc < anoAtual) {
			mesNasc++
			qtdMes++

			se(qtdMes == 12) {
				qtdMes = 0
				qtdAno++
			}
			se(mesNasc == 12) {
				anoNasc++
				mesNasc = 0
			}
		}
		se(diaNasc == diaAtual) {
			qtdMes++
			qtdDia = 0
		}
		senao se(diaNasc < diaAtual) {
			qtdMes++
			qtdDia = diaAtual - diaNasc
		}
		senao {
			qtdDia = diasMes(mesAtual -1, anoAtual) + diaAtual - diaNasc 
		}

		escreva("\nAnalisando, por favor aguarde...")
		Util.aguarde(3000)
		escreva("\nVocê tem: ", qtdAno, " anos, " + qtdMes + " meses e " + qtdDia + " dias.")
		Util.aguarde(1000)
		escreva("\nTotal de dias vividos: ", (qtdAno * 365) + (qtdMes * 30) + qtdDia + 10, "\n\n")
	}
	
	funcao inicio(){
		inteiro dia, mes, ano

		escreva("Legal, vamos cadastrar sua data de nascimento...")
		escreva("\nComece informando o dia: ")
		leia(dia)
		escreva("Legal, agora o mês: ")
		leia(mes)
		escreva("Por fim, o ano: ")
		leia(ano)

		se(validarDt(dia, mes, ano) == 1) {
			calcIdade(dia, mes, ano)
		}
		senao {
			escreva("\nOps, data inválida!\n")
		}
	}
}


















/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2469; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */