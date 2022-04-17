# Exemplo projeto java Spring | Command
## Patterns / Principios utilizados
* CQRS (Command Query Responsibility Segregation)
  * https://docs.microsoft.com/pt-br/azure/architecture/patterns/cqrs
* DDD (Domain Driven Design)
  * https://docs.microsoft.com/pt-br/dotnet/architecture/microservices/microservice-ddd-cqrs-patterns/ddd-oriented-microservice
* Hexagonal Architecture
  * https://medium.com/ssense-tech/hexagonal-architecture-there-are-always-two-sides-to-every-story-bc0780ed7d9c

## Projeto
* É basicamente uma api simples para cadastro de usuarios
* O interessante é a arquitetura e as implementações que serão discorridas abaixo

## Foi utilizado:
* Flyway
  * para gerenciar o versionamento da base de dados
  * Muito util para ter maior controle dos comandos executados e conseguir reverter problemas facilmente
* Swagger (OpenApi)
  * http://localhost:8080/swagger-ui/index.html
  * Documentação da api, também é possivel executar os endpoints
* Pattern OpenApi
  * Interface implementada pelo controller para separar a documentação
* SpringValidation e Javax validations
  * Validações do controller e dominio por meio de anotações
* Validações customizadas
  * Classe ExceptionHandlerConfig
* Docker-compose
  * Arquivo adicionado ao projeto
  * Para subir facilmente uma base postgres para ser utilizada pelo serviço
* Classe de dominio pai DomainEntity
  * Insere automaticamente a data de criação e alteração dos dominios criados
  * createdAt e updatedAt
* UseCase Pattern
  * Permite criar classes separadas para cada service de caso de uso
* SonarLint
  * Plugin local do sonar para detectar code smells
  * Os problemas encontrados foram solicionados
  * Restaram apenas 2 code Smells que não faziam muito sentido para nossa regra
* UUID
  * UUID é principalmente utilizado em ambientes de microservices
  * Uma vez que os ids numericos podem facilmente se repetir entre as diferentes instancias de serviços
  * Resumidamente previne ids duplicados

## Considerações
* CQRS
  * Apenas o serviço command foi criado
  * Deveria ter outro serviço de query para realizar as consultas de usuarios criados
* Testes
  * Utilizamos o jacoco como coverageRunner para ignorar cobertura em getters & setters
  * Foram Criados apenas testes de cenario feliz
  * O ideal seria criar testes que esperam exceptions e validações com erro vindos do controller e afins
  * Por se tratar de arquitetura Hexagonal seria interessante testes para validar se nenhuma camada foi perfurada(uma camada com acesso a outra que nao deveria ex.: Controller acessando repository)
