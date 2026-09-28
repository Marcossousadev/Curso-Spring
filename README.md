# 🌱 Estudos de Spring Boot

Repositório criado para registrar meus estudos e aprendizados durante o curso **Spring para Iniciantes**, com foco nos fundamentos do **Spring Framework** e **Spring Boot**.

O objetivo foi entender como funciona a estrutura de uma aplicação backend Java utilizando Spring e aprender os principais conceitos necessários para começar a desenvolver **APIs REST**.

## 📚 Conteúdos estudados

### ☕ Spring Framework e Spring Boot

* Diferença entre **Spring Framework** e **Spring Boot**
* Vantagens do Spring Boot
* Conceito de aplicações backend
* Autoconfiguração do Spring Boot
* Criação e inicialização de aplicações Spring

### 🚀 Spring Initializr

Aprendi a criar projetos Spring Boot utilizando o **Spring Initializr**, configurando:

* Java
* Maven
* Versão do Spring Boot
* Group e Artifact
* Dependências do projeto

### 📦 Maven e estrutura do projeto

Estudei a estrutura básica de um projeto Spring Boot e o gerenciamento de dependências através do Maven.

Principais conceitos:

* `pom.xml`
* Dependências
* `src/main`
* `src/test`
* `resources`
* `application.properties`

### 🏷️ Anotações do Spring

Estudei como as anotações são utilizadas pelo Spring para configurar e gerenciar os componentes da aplicação.

Principais anotações estudadas:

* `@SpringBootApplication`
* `@Configuration`
* `@EnableAutoConfiguration`
* `@ComponentScan`
* `@RestController`
* `@Service`
* `@Bean`
* `@RequestMapping`
* `@GetMapping`
* `@PostMapping`
* `@RequestBody`
* `@PathVariable`
* `@RequestParam`

### 🌐 APIs REST

Aprendi os conceitos básicos para criação de APIs REST utilizando Spring Boot.

Estudei:

* Requisições HTTP
* Endpoints
* Métodos HTTP
* `GET`
* `POST`
* Respostas da API
* Recebimento de dados através do JSON
* Parâmetros enviados pela URL
* Conceito de API Stateless e Stateful

### 🎮 Controllers

Aprendi a criar Controllers para receber e processar requisições HTTP.

Utilizei principalmente:

```java
@RestController
```

e os mapeamentos:

```java
@GetMapping
@PostMapping
@RequestMapping
```

### ⚙️ Services

Estudei a separação de responsabilidades utilizando uma camada de Service.

O Controller fica responsável por receber as requisições, enquanto o Service concentra a lógica da aplicação.

Exemplo:

```java
@Service
public class HelloWorldService {

    public String executar() {
        return "Hello World";
    }
}
```

### 🔌 Injeção de Dependência

Aprendi o conceito de **Dependency Injection (DI)** e como o Spring gerencia os objetos da aplicação.

Também estudei:

* Beans
* Ciclo de vida dos componentes
* `@Service`
* `@Bean`
* `@Configuration`
* Injeção de dependências entre classes

### 🧩 Lombok

Também conheci o **Lombok** e sua utilização para reduzir código repetitivo em classes Java, como getters e setters.

Exemplo:

```java
@Getter
@Setter
@AllArgsConstructor
public class User {

    private String name;
    private String email;
}
```

### 🛠️ Configurações da aplicação

Estudei como realizar configurações através do:

```text
application.properties
```

incluindo configurações relacionadas à porta da aplicação e profiles.

Também aprendi sobre a utilização de variáveis de ambiente durante a execução da aplicação.

### 🧪 Testando a API

Utilizei ferramentas para realizar requisições HTTP e testar os endpoints desenvolvidos.

Entre os conceitos praticados:

* Envio de requisições `GET`
* Envio de requisições `POST`
* Envio de JSON
* Teste de parâmetros
* Verificação das respostas da API

## 🎯 O que aprendi

Ao finalizar o curso, consegui compreender melhor como uma aplicação Spring Boot é estruturada e como seus principais componentes trabalham juntos.

O fluxo básico que estudei foi:

```text
Cliente
   ↓
Controller
   ↓
Service
   ↓
Regra de negócio
   ↓
Resposta
```

Também passei a entender melhor conceitos importantes do ecossistema Spring, como **Injeção de Dependência, Beans, Anotações, Controllers, Services e APIs REST**.

## 💻 Tecnologias estudadas

* Java ☕
* Spring Framework
* Spring Boot
* Maven
* Lombok
* API REST
* HTTP
* JSON

## 📖 Curso

**Curso de Spring para Iniciantes | Tutorial Completo de Java Spring**

[Assistir ao curso no YouTube](https://youtu.be/YY_hf0FOIcU)

---

> Repositório criado com o objetivo de documentar minha evolução nos estudos de Java e Spring Boot.
