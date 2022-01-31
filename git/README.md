<h2> GIT </h2>
<p align="center" style="color:Green">
    Software sugerido: 
    <a href="https://git-scm.com/downloads" target="_blank">GitBash</a>
</p>
<h3>Configuração</h3>
<p align="justify">As configurações do GIT são armazenadas no arquivo
(.gitconfig) localizado no diretório do usuário e as configurações 
realizadas 
através dos comandos abaixo serão incluídas neste mesmo arquivo.
</p>

##### Setar usuário
	git config --global user.name "Leon4rdoAlves"
##### Setar email
	git config --global user.email leonardo@ebonysys.or
##### Setar editor
	git config --global core.editor vim
##### Setar ferramenta de merge
	git config --global merge.tool vimdiff
##### Setar arquivos a serem ignorados
	git config --global core.excludesfile ~/.gitignore
##### Listar configurações
	git config --list

<p align="justify">
    Importante lembrar que você pode optar por configurar apenas
    o <strong>nome de usuário</strong> e <strong>email</strong>, 
    as demais configurações podem seguir como por padrão. 
</p>
<hr><h3>Ajuda</h3>

	git help
	git help add
	git help commit
    git help push	
    git help <qualquer_comando_git>

<hr><h3>Estados</h3>
♦ Modificado (modified) <br>
♦ Preparado (staged/index) <br>
♦ Consolidado (comitted)

<hr><h3>Ignorar Arquivos</h3>
<p align="justify">
No arquivo (.gitignore) você pode listar arquivos, diretórios e/ou
extensões que não devem ser enviados ao seu repositório no github.
Temos duas possibilidades de usabilidade quanto ao arquivo .gitignore.

♦ **Geral**: Normalmente armazenado no diretório do usuário. O arquivo que
possui a lista dos arquivos/diretórios a serem ignorados por <strong>
todos os repositórios</strong> deverá ser declarado conforme citado 
acima. <br>

♦ **Por repositório**: Deve ser armazenado no diretório do repositório
e deve conter a lista dos arquivos/diretórios que devem ser ignorados 
apenas para o repositório específico.
</p>
<h3>Repositório Local</h3>

<h4 align="center">Criando um repositório...</h4>

	git init nome
<h4 align="center">Verificando status...</h4>

	git status
<h4 align="center">Adidionando...</h4>
###### Adicionar um arquivo em específico
	git add arquivo.extensão
###### Adicionar um diretório em específico
	git add diretorio
###### Adicionar todos os arquivos/diretórios
	git add .
###### Adicionar um arquivo que está listado no .gitignore
	git add -f arquivo_no_gitignore.extensão

<h4 align="center">Commitando arquivos...</h4>
###### Comitar um arquivo	
	git commit arquivo.extensão
###### Comitar vários arquivos
	git commit arquivo.extensão outro_arquivo.extensão
###### Comitar informando mensagem (mais usual)
	git commit arquivo.extensao -m "mensagem de commit"

<h4 align="center">Removendo...</h4>
###### Remover arquivo
	git rm arquivo.extensão
###### Remover diretório
	git rm -r diretorio

<h4 align="center">Visualizando histórico...</h4>
###### Exibir histórico	
	git log	
###### Exibir histórico com diff das duas últimas alterações
	git log -p -2	
###### Exibir resumo do histórico 
	git log --stat
###### Exibir informações resumidas em uma linha
	git log --pretty=oneline	
###### Exibir histórico com formatação específica
	git log --pretty=format:"%h - %an, %ar : %s"
	
♦ %h: Abreviação do hash;<br>
♦ %an: Nome do autor;<br>
♦ %ar: Data;<br>
♦ %s: Comentário.<br>
...mais opções de formatação → [Git Book](http://git-scm.com/book/en/Git-Basics-Viewing-the-Commit-History)

###### Exibir histório de um arquivo específico
	git log -- <caminho_do_arquivo>
###### Exibir histórico de um arquivo específico que contêm uma determinada palavra
	git log --summary -S<palavra> [<caminho_do_arquivo>]
###### Exibir histórico modificação de um arquivo
	git log --diff-filter=M -- <caminho_do_arquivo>

♦ O **M** pode ser substituido por: 
+ **A** Adicionado
+ **C** Copiado 
+ **D** Apagado 
+ **M** Modificado 
+ **R** Renomeado<br> 
...entre outros.

###### Exibir histório de um determinado autor
	git log --author=usuario
###### Exibir revisão e autor da última modificação de uma bloco de linhas
	git blame -L 12,22 arquivo.extensão 

<h4 align="center">Desfazendo alterações...</h4>
###### Desfazendo alteração local (working directory) → *antes da Staged Area*  
	git checkout -- arquivo.extensão
###### Desfazendo alteração local (staging area) → *depois de adc na Staged Area*
	git reset HEAD arquivo.extensão

Pós utilizar este comando... caso seja exibida esta saída:

	Unstaged changes after reset:
	M	arquivo.extesnsão

Significa que o comando reset **não** alterou o diretório de trabalho. 
O que pode ser feito através do comando:

	git checkout arquivo.extensão

<h3>Repositório Remoto</h3>
<h4 align="center">Vinculando...</h4>
###### Vincular repositório local com um repositório remoto
	git remote add origin git@github.com:nomedeusuario/nomedorepositório.git
###### Desvincular um repositório remoto
	git remote rm curso-git

<h4 align="center">Visualizando...</h4>
###### Repositórios
	git remote
	git remote -v
###### Exibir informações dos repositórios remotos
	git remote show origin

<h4 align="center">Renomeando um repositório...</h4>

	git remote rename origin curso-git

<h4 align="center">Clonando...</h4>
###### Clonar um repositório remoto já existente no seu PC
	git clone git@github.com:nomedeusuario/nomedorepositorio.git

<h4 align="center">Atualizando...</h4>
###### Enviar arquivos/diretórios para o repositório remoto

O primeiro **push** de um repositório deve conter o nome do 
repositório remoto e o branch.

	git push -u origin master
	
Ainda que uma boa pratica manter, os demais **pushes** não 
precisam dessa informação.

	git push
##### Buscar as alterações, mas não aplica-las no branch atual
	git fetch
##### Atualizar os arquivos no branch atual
	git pull

<h4 align="center">TAGs...</h4>
###### Criando uma tag leve
	git tag vs-1.1
###### Criando uma tag anotada
	git tag -a vs-1.1 -m "Minha versão 1.1"
###### Criando uma tag assinada
Para criar uma tag assinada é necessário uma chave privada 
(GNU Privacy Guard - GPG).
    
    git tag -s vs-1.1 -m "Minha tag assinada 1.1"
###### Criando tag a partir de um commit (hash)
	git tag -a vs-1.2 9fceb02
###### Criando tags no repositório remoto
	git push origin vs-1.2
###### Criando todas as tags locais no repositório remoto
	git push origin --tags
<h4 align="center">Branch...</h4>
A **main** é a branch principal do GIT. Você pode encontrar também pelo
nome de **master**, porém, este termo de cunho racista foi eliminado,
mas ainda é econtrado em softwares desatualizados.

O **HEAD** é um ponteiro *especial* que indica qual é a branch atual. 
Por padrão, o **HEAD** aponta para a branch principal, **main**.

###### Criando uma nova branch
	git branch nomeNovaBranch
###### Trocando para um branch (existente)
	git checkout nomeBranchExistente
	
...deste momento pra frente, o ponteiro principal **HEAD** estará 
apontando para o branch nomeBranchExistente.

###### Criar uma nova branch e trocar automaticamente
	git checkout -b novaBranch
###### Voltar para o branch principal (main)
	git checkout main

<h4 align="center">Merging...</h4>
Vale ressaltar que, para fazer o **merge**, é necessário estar na 
branch que deverá receber as alterações. Ou seja, se eu quero que 
a branch **main** receba as atualizações que foram feitas na branch
**upstream**, eu preciso que o **HEAD** esteja apontando para a main
no momento que fizer o merging. <br>

O merge automático será feito em arquivos 
textos que não sofreram alterações nas mesmas linhas, já o merge 
manual será feito em arquivos textos que sofreram alterações nas 
mesmas linhas.


###### Merge entre os branches → estando na branch main
	git merge upstream

A mensagem indicando um *merge* manual será:

	Automerging arquivo.extensão
	CONFLICT (content): Merge conflict in arquivo.extensão
	Automatic merge failed; fix conflicts and then commit the result.

###### Apagando uma branch
	git branch -d nomeDaBranch
###### Listar branches 
	git branch
###### Listar branches com informações dos últimos commits
	git branch -v
###### Listar branches que já foram fundidas (merged) com o **main**
	git branch --merged
###### Listar branches que não foram fundidas (merged) com o **main**
	git branch --no-merged

<h4 align="center">Branch repositório remoto...</h4>

###### Criando com o mesmo nome
	git push origin nomeDaBranch
###### Criando com nome diferente
	git push origin nomeDaBranch:novaBranch
##### Baixar uma branch remoto para edição
	git checkout -b nomeDaBranch origin/nomeDaBranch
##### Apagar branch remoto
	git push origin:nomeDaBranch

<h4 align="center">Rebasing...</h4>
###### Fazendo o **rebase** entre uma branch upstream e a main.

	git checkout experiment
	git rebase main

Mais informações e explicações sobre o [Rebasing](http://git-scm.com/book/en/Git-Branching-Rebasing)

<h4 align="center">Stashing...</h4>
Para alternar entre uma branch e outra é necessário fazer o commit 
das alterações atuais para depois trocar de branch. Se existir a 
necessidade de realizar a troca sem fazer o commit é possível criar 
um **stash**. 

O Stash é como se fosse uma branch temporária que contem apenas as 
alterações ainda não commitadas.

###### Criar um stash
	git stash
###### Listar stashes
	git stash list
###### Voltar para o último stash
	git stash apply
###### Voltar para um stash específico
	git stash apply stash@{2}
Onde **2** é o indíce do stash desejado.
###### Criar um branch a partir de um stash
	git stash branch nomeBranch

<h4 align="center">Reescrevendo histórico...</h4>
###### Alterando mensagens de commit
	git commit --amend -m "nova mensagem"
###### Alterar 3 últimos commits
	git rebase -i HEAD~3

O editor de texto será aberto com as linhas representando os 3 últimos commits.

	pick f7f3f6d criei uma branch para o menu
	pick 310154e atualizei as fontes do menu
	pick a5f4a0d finalizei o menu

Altere para edit os commits que deseja realizar alterações.

	edit f7f3f6d criei uma branch para o menu e rodapé
	pick 310154e atualizei as fontes do menu
	pick a5f4a0d finalizei o menu

Feche o editor de texto.

Agora, digite este comando para alterar a mensagem do commit 
que foi marcado como **edit**.

	git commit –amend -m “Nova mensagem”

Aplique a alteração

	git rebase --continue

**Atenção:** É possível alterar a ordem dos commits ou remover 
um commit apenas mudando as linhas ou removendo.

<h4 align="center">Squashing...</h4>
###### Juntando vários commits
Seguir os mesmos passos acima, porém marcar os commtis que devem 
ser juntados com **squash**

<h4 align="center">Removendo histórico...</h4>	
###### Remover todo histórico de um arquivo
	git filter-branch --tree-filter 'rm -f passwords.txt' HEAD

<h4 align="center">Bisect...</h4>
O bisect (pesquisa binária) é útil para encontrar um commit que 
está gerando um bug ou uma inconsistência entre uma sequência 
de commits.
###### Iniciar pesquisa binária
	git bisect start
###### Marcar o commit atual como ruim
	git bisect bad
###### Marcar o commit de uma tag que esta sem o bug/inconsistência
	git bisect good vs-1.1
###### Marcar o commit como GOOD (bom)
O GIT irá navegar entre os commits para ajudar a indentificar o 
commit que está com o problema. Se o commit atual não estiver 
quebrado, então é necessário marca-lo como **bom**.

	git bisect good

###### Marcar o commit como BAD (ruim)
Se o commit estiver com o problema, então ele deverá ser marcado 
como **ruim**.

 	git bisect bad
 
###### Finalizar a pesquisa binária
Depois de encontrar o commit com problema, para retornar para o 
*HEAD* utilize:
	
	git bisect reset

<hr>
Este conteúdo não está completo, caso queira contribuir, será muito bem aceito!

Vídeos mostrando na prática → [Canal códigos simples](https://www.youtube.com/channel/UC8fRZfYGd21_D8DwuEcFuHw)
</br>Cursos | mais informações → <a href="https://api.whatsapp.com/send?phone=5511979714423">WhatsApp</a>
