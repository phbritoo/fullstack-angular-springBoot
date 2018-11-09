# Desafio FullStack
A aplicação springboot já possui um build do frontend carregado, ao acessar localhost:8080. Recomendável importar o projeto do backend no Eclipse e o frontend no vscode para melhor experiência.
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
```sh
$ cd back-end
$ mvnw clean install
$ mvnw spring-boot:run
```

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

