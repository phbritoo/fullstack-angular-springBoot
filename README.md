# Desafio FullStack
A aplicação springboot já possui um build do frontend carregado, ao acessar localhost:8080. Recomendável importar o projeto do backend no Eclipse e o frontend no vscode para melhor experiência.
<<<<<<< HEAD
# Necessário
- Maven 3+
- Node.js 8+
- Java 1.8 (JDK) - JAVA_HOME
- Springboot 2.1.0 cli (incluir no PATH)

### Executando a aplicação
Após baixar o repositório:
### Front-end
```sh
$ cd front-end
$ npm install
$ npm build
```
### Back-end
=======

### Executando o projeto
Após baixar o repositório,
Abra o Eclipse e execute o projeto com SpringBoot,depois na pasata do projeto Front-end digite:
>>>>>>> parent of 8a79aea... update readme
```sh
$ npm install
$ ng build
```
Por fim, dê um restart na aplicação do back-end.

### Configurando uma variavel de ambiente
Caso ao rodar o "mvnw clean install" der erro, seguir esse passo a passo:

- Aperte a tecla do windows + R;
- No campo que abrir digite: " C:\Windows\System32\SystemPropertiesAdvanced.exe ";
- Aperte na aba: " Avançado ";
- Aperte no botão: " Variavel de amabiente ";
- Após isso, adicone uma nova variavel com o nome " JAVA_HOME ";
- Agora, indique o caminho aonde está instalado seu JDK, no botão " Buscar Diretorio ", geralmente o caminho é esse: "C:\Program Files\Java\jdk1.8.0_191";
- Reabra o CMD e tente executar o comando " mvnw clean install" novamente;
 

### Testes Front-End
Teste Unitário: 
```sh
$ ng test
```
Teste ponta a ponta:
```sh
$ ng e2e
```
<<<<<<< HEAD

### Testes Back-end

Integração e unitários via Junit
```sh
$ mvnw test
```


=======
>>>>>>> parent of 8a79aea... update readme
