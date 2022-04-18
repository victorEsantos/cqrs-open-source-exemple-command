# Dicas de uso git

obs.: todos os comandos podem ser executados em um terminal, porem existem ferramentas de versionamento nas IDEs que ajudam muito.

## Inicializar um novo repositorio

- Inicializar o repositorio
  - ```git init```
- Adicionar uma origem
  - ```git remote add origin git@github.com:user/projectName.git```

## Primeiro commit / commitar alterações
- Preparar alterações adicionando
  - ```git add .```
  - o último argumento do commando é a pasta/arquivo, para adicionar tudo basta digitar um "."
- Para commitar as alterações localmente basta digitar o commando:
  - ```git commit -m 'meu primeiro commit```
  - a flag -m determina o comentario do commit, no caso será: 'meu primeiro commit'
- Pra enviar as alterações para o servidor de onde está o repositorio
  - ```git push```  
- Como compartilhar suas mudanças com outras pessoas da equipe
  - Basta realizar um commit e um push
  - Para saber a branch atual em que o commit foi feito  digitar ```git status```
  - Passando o nome da branch sua equipe pode dar um checkout e verificar as alterações
  - Também é possivel verificar os arquivos modificados e as alterações feitas, acessando a area de versionamento de codigo da IDE, ou olhando a branch diretamente no gerenciador de repositorio
- Como desfazer alterações
  - No 'git log' é possivel verificar o historico de commits, umas das informaçoes é o codigo do commit
  - O codigo do nosso commit de exemplo é "g4h6c649"
  - para reverter: ```git revert g4h6c649```
  - O revert será efetuado, devemos seguir novamente todo o processo de commit para enviar as alterações
- Resolver conflitos de merge
  - para resolver conflitos de merge primeiro devemos efetuar o merge, geralmente queremos realizar merge com a branch master/main
  - merge com a master ```git merge origin/master```
  - caso ocorram conflitos de merge podemos resolve-los pela ide(vscode, intellij...) selecionando qual das partes conflitantes queremos usar.
  - após o merge ser realizados podemos seguir com o processo de commit
- Como usar branches
  - Para verificar a branch atual
    - ```git status```
  - Para criar uma branch
    - ```git checkout -b nomeBranch```
  - Para dar checkout em uma branch existente
    - Baixar conteudo do repositorio remoto: ```git fetch```
    - ```git pull``` para garantir que receberá a branch localmente
    - ```git checkout -b nomeBranch origin/nomeLocal```
- Como encontrar bugs
  - git diff
    - mostrar diff entre dois commits: ```git diff b4cb8d9..9c5733f```
  - git log
    - mostra o log do git
  - Git blame para mostrar linha x a linha y do arquivo xyz
    - ```git blame -L 1,5 arquivoxyz.md```
- Como escolher commits(cherry pick)
- git commit codigoCommit
  - ```git cherry-pick f13bd3c3531f26e805c606729857f39987a2420f```  
