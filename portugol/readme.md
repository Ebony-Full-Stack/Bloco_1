<h2 align="center">❌ Portugol | Algoritmo ❌</h2> 

<p align="justify">
Vamos lá, talvez você já tenha visto/estudado algoritmos utilizando o programa 
<strong>VisuALG</strong>. Vamos utilizar aqui o <strong>Portugol Studio</strong>,
por ser mais próximo do que veremos em JAVA, mas não se preocupe, apenas alguns 
detalhes serão acrescentados, como por exemplo o uso das chaves '{ }' abrindo e 
fechando os blocos e a possibilidade de importação de bibliotecas.
</p>

Vamos começar com a instalação do programa, clique de acordo com seu sistema operacional. <br> 
- Versão para Windows → [Portugol Studio](https://github.com/UNIVALI-LITE/Portugol-Studio/releases/download/v2.7.5/portugol-studio-2.7.5-windows.exe)
- Versão para Linux → [Portugol Studio](https://github.com/UNIVALI-LITE/Portugol-Studio/releases/download/v2.7.5/portugol-studio-2.7.5-linux-x64.run.zip)
- Instalação → [Passo-a-passo](https://www.youtube.com/playlist?list=PL_Mb9ReKpfJWGDxrJxkvrMpk5OUyQNCza)

<hr>

<h3>TIPOS DE DADOS</h3>

<strong>programa</strong> { <br>
ㅤㅤfuncao <strong>inicio( )</strong> { <br>
ㅤㅤㅤㅤ<strong>inteiro</strong> idade = 30ㅤㅤ...valores inteiros<br>
ㅤㅤㅤㅤ<strong>real</strong> altura = 1.83ㅤㅤ...valores reais<br>
ㅤㅤㅤㅤ<strong>caracter</strong> letra = "E"ㅤㅤ...apenas uma letra<br>
ㅤㅤㅤㅤ<strong>cadeia</strong> nome = "Ebony"ㅤㅤ...textos<br>
ㅤㅤㅤㅤ<strong>logico</strong> status = verdadeiroㅤㅤ...verdadeiro ou falso<br>
ㅤㅤ} <br>
}

<hr>

<h3>OPERADORES</h3>
<h5>- ARITMÉTICOS</h5>

<strong>programa</strong> { <br>
ㅤㅤfuncao <strong>inicio( )</strong> { <br>
ㅤㅤㅤㅤ<strong>inteiro</strong> valor1 = 10 <br>
ㅤㅤㅤㅤ<strong>inteiro</strong> valor2 = 15 <br>

ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 + valor2 )ㅤㅤ...somando<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 - valor2 )ㅤㅤ...subtraindo<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 * valor2 )ㅤㅤ...multiplicando<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 / valor2 )ㅤㅤ...dividindo<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 % valor2 )ㅤㅤ...resto da divisão<br>
ㅤㅤ} <br>
} 
<br><br>
<h5>- RELACIONAIS</h5>

<strong>programa</strong> { <br>
ㅤㅤfuncao <strong>inicio( )</strong> { <br>
ㅤㅤㅤㅤ<strong>inteiro</strong> valor1 = 10 <br>
ㅤㅤㅤㅤ<strong>inteiro</strong> valor2 = 15 <br>

ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 == valor2 )ㅤㅤ...igual<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 >= valor2 )ㅤㅤ...maior que ou igual há<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 <= valor2 )ㅤㅤ...menor que ou igual há<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 != valor2 )ㅤㅤ...diferente de<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 > valor2 )ㅤㅤ...maior que<br>
ㅤㅤㅤㅤ<strong>escreval</strong> ( valor1 < valor2 )ㅤㅤ...menor que<br>ㅤㅤ
} <br>
}

<hr>

<h3>LAÇOS DE REPETIÇÃO</h3>
<strong> - PARA</strong> | O laço "para" é composto de quatro partes: <br>


<strong>para</strong> ( <strong>início</strong> ; <strong>fim</strong> (condição) ; 
<strong>passo</strong> ) {<br>
ㅤㅤㅤ. <br>
ㅤㅤㅤ. <br>
ㅤㅤcorpo <br>
ㅤㅤㅤ. <br>
ㅤㅤㅤ. <br>
}

<strong>INÍCIO</strong> | Qualquer variável definida aqui, somente existirá dentro 
do código desse laço, mas em outras linguagens ela continua existindo fora dele.
Esta variável pode ser inicializada antes ou diretamente na criação do laço.


<strong>FIM / Condição</strong> | é um teste para verificar se deve continuar dentro 
do laço ou sair dele. O teste ocorre logo após o início, desta forma, se a resposta for
'falsa' ele sai do laço imediatamente, sem executar o corpo e o passo nenhuma vez.


Caso a resposta do teste seja verdadeira, o corpo será executado quantas vezes sejam
necessárias, até que a resposta deixe de ser verdadeira, neste momento a repetição será
interrompida. 

<strong>CORPO</strong> | Trecho principal de código, que será repetido zero ou mais vezes.
Ele tem acesso às variáveis da iniciação e condição, e pode manipulá-las ou não. Também 
pode executar comandos que "forçam" a quebra do laço (break) ou que continuam a partir do 
passo (continue) antes de chegar ao final do corpo. Se esses comandos não forem utilizados, 
o corpo segue até o final, antes de passar pra próxima etapa.

<strong>PASSO</strong> | Por padrão este será autoincrementado em +1, mas é possível utilizar
o passo que sua aplicação necessitar. Podendo ser em ordem crescente... de 1 em 1, 2 em 2, 50 
em 50 e etc. Também em ordem decrescente... -1 em -1, -2 em -2, -50 em -50.
Bastando apenas informar o valor da incrementação, sendo o 1 representado por ++ como exemplo.


para (int contador = 1 ;ㅤcontador <= 10;ㅤcontador++ ) {<br>

ㅤㅤㅤescreval ( contador ); <br>

}

<hr>

<strong> - FAÇA ENQUANTO</strong> | A repetição faça enquanto, como o próprio nome sugere,
primeiro faz depois testa. Desta forma, no mínimo uma execução do corpo será feita. <br>

Note no exemplo abaixo que, a condição lógica de teste é que a nota precisa estar no intervalo
entre 0 e 10 pra ser aceita e o programa seguir seu curso... O que ocorre é que, independente
de qual nota seja inserida pelo usuário, ela só será testada dentro do laço, desta forma, para
que a repetição seja encerrada, a nota precisa estar entre 0 e 10, caso contrário, o input será
feito novamente e quantas vezes for preciso até que a condição seja satisfeita.

<strong>faca</strong> {<br><br>
ㅤㅤㅤescreva("Digite uma nota: ") <br>
ㅤㅤㅤleia(nota) <br><br>
<strong>enquanto</strong> ( nota < 0 ou nota > 10 ) 
<br>}

<hr>

Veja mais no meu canal → [Códigos Simples](https://www.youtube.com/channel/UC8fRZfYGd21_D8DwuEcFuHw)
</br>...mais informações → <a href="https://api.whatsapp.com/send?phone=5511979714423">WhatsApp</a>
