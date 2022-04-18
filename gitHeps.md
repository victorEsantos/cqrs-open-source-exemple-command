# Dicas de uso git

obs.: todos os comandos podem ser executados em um terminal, porem existem ferramentas de versionamento nas IDEs que ajudam muito.

## Inicializar um novo repositorio

- Inicializar o repositorio
  - ```git init```
- Adicionar uma origem
  - ```git remote add origin git@github.com:user/projectName.git```

## Primeiro commit
- Preparar alterações adicionando
  - ```git add .```
  - o último argumento do commando é a pasta/arquivo, para adicionar tudo basta digitar um "."
- Para commitar as alterações localmente basta digitar o commando:
  - ```git commit -m 'meu primeiro commit```
  - a flag -m determina o comentario do commit, no caso será: 'meu primeiro commit'
- Pra enviar as alterações para o servidor de onde está o repositorio
  - ```git push```  
