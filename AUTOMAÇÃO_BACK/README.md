# Informações de contato:

Linkedin   - [acessar](https://www.linkedin.com/in/jjhon/).<br>
Portfólio  - [acessar](https://jhonjhon95.github.io/portfolio-site/).<br>
Whatsapp   - [acessar](https://api.whatsapp.com/send?phone=5566997218952).<br>
GitHub     - [acessar](https://github.com/jhonjhon95).<br>
GitLab     - [acessar](https://jhonjhon95.gitlab.io/).<br>

# Desafio Sicredi: Testando APIs

Projeto para garantir cobertura de testes para a API de Simulação de Consulta de Produtos.

##  Requisitos para execução
* Java 11+ JDK instalado
* Maven configurado no PATH da aplicação
* Aplicação local instalada na máquina
* Plugins devem ser instalados

## Documentacão técnica da aplicação

- A documentação técnica da API está disponível no seguinte link: [acessar](https://sicredi-desafio-qe.readme.io/reference/home).

## Bugs encontrados

* Ao cadastrar um novo produto, todos os campos aceitam null. (na documentação o Request body nã trata isto)
* É possivel Cadastrar um produto enviando apenas partes do Request body. (Exemplo: Não enviando o preço)

## Sugestões.

* Atualizar a documentação (Swagger) de: GET /products/{id}, para a informação que retorna atualmente.


## Estrutura do projeto

````text

|__src (java root path projeto)
    |__main
    |  |__java
    |  |  |__io.sicredi.desafio
    |  |    |__client
    |  |    |__dto
    |  |    |__environment
    |  |    |__factory
    |  |___Setup (contém arquivos de configuração)
    | 
    |__test
    |  |__java
    |  |  |__io.sicredi.desafio
    |  |    |__contrato
    |  |    |__funcional
    |  |    |__smoke
    |  |__HealthCheck
    |
    |__resources
    |  |__schema(contém o esqueleto Json das API's para validação)
    |     |__cadastrar_produtos
    |     |__listar_produtos_por_ID
    |     |__listar_todos_produtos
    |     |__login_senha_invalida
    |     |__login_sucesso
    |
    |__pom.xml (Contém as dependências relacionada ao projeto)
    |__.gitignore (Contém o diretório de arquivos que devem ser ignorados no momento do commit)   
````

## Como executar os testes
Execução através da IDE: É possível selecionar o teste desejado e simplesmente clicar em 'play' no método correspondente.<br>
do teste ou pode-se executar pela linha de comando usando o seguinte comando:<br>

Instalar dependências<br>
```bash
mvn clean install 
```
Rodar todos os testes<br>
```bash
mvn test 
```
Rodar teste especifico utilizando o nome da Tag<br>
```bash
mvn clean test -Dgroups=SMOKE -e
```
Rodas diversas Tags
```bash
mvn test -Dgroups="SMOKE, FUNCIONAL"
```
Após a execução dos testes será criada na raiz do projeto a pasta "allure-results"

Para gerar o relatório Allure 
```bash
mvn allure:report
mvn allure:serve
```
Para rodar localmente e gerar o relatório de uma só vez rodar o comando: 
```bash
mvn clean test; mvn allure:report; mvn allure:serve
```
## Quando rodar pela Pipeline do GitLab, o relatório ficará disponível no Artefato da tarefa: 
 - Exemplo [aqui](https://jhonjhon95.gitlab.io/-/prova_sicredi_api/-/jobs/6948905777/artifacts/allure-report/index.html).

 ## Execução automática da pipeline: 
 - A automação irá rodar de forma automática toda terça feira às 10hr [UTC-4].

 # Plano de Teste e Estratégia de Testes.

 ## Introdução

- Este plano descreve a estratégia de testes para a API de Simulação de Consulta de Produtos do Sicredi, visando garantir a cobertura de testes, identificar e corrigir bugs, e assegurar que a aplicação atende aos requisitos.

  ## Objetivos do Teste

- Validar a funcionalidade da API.
- Garantir robustez e confiabilidade.
- Identificar e corrigir bugs.
- Assegurar conformidade com a documentação técnica.
- Verificar usabilidade e qualidade do código.

  ## Escopo do Teste

- Funcionalidades a Testar: Cadastro de produtos, consulta por ID, listagem de produtos, login com credenciais válidas e inválidas.

  ## Abordagem de Teste

- Testes Funcionais: Validar funcionalidades conforme os requisitos.
- Testes de Contrato: Verificar conformidade com contratos de API.
- Testes de Smoke: Realizar testes básicos para estabilidade.
- Testes de Regressão: Assegurar que novas alterações não impactem funcionalidades existentes.