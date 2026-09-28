package com.marcossousadev.course_spring.controller;
// para quê o Spring identifique que essa classe é um controller e faça todas as configurações necessárias
// para que essa classe receba as requisições e monte as respostas para os clients

import com.marcossousadev.course_spring.domain.User;
import com.marcossousadev.course_spring.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// combina anotações
// como @Controller, @ResponseBody
// pq necessáriamente um controller não deve apenas retornar um XML ou JSON, ele pode retornar uma página HTML
// antigamente era mais usada essa estratégia de renderizar páginas
// que não é o nosso caso, a gente tá criando uma API que vai retornar apenas dados para o front-end com base nos
// endpoints, lida apenas com regras de negócio, conxeção com banco de dados, retorna através de ResponseBody,
// JSON ou XML
// STATELESS => a cada nova requisição, eu recebo todas as informações que eu preciso para fazer aquela funcionalidade
// exemplo facebook post, envio meu token que já to autorizado, qual post que eu quero excluir e as vezes vou ter que
// enviar mais alguma informação
// STATEFULL => o estado do cliente é mantido no servidor, através por exemplo de uma única requisição de autenticação
// controller apenas recebe a requisição, mas passa o processamento da lógica de negócio para o Service
@RestController
@RequestMapping("/hello-word")
public class HelloWordController {
    // precisamos explicar para o Spring que precisamos da instância da classe de HelloWorldService
    // existe duas formas de fazer isso!
    // pelo constructor
    // segunda forma de fazer, mais moderna
    // diz para o Spring que ele deve injetar essa dependência
    // ela deve ser automaticamente injetada
    @Autowired
    private HelloWordService helloWorldService;
    // exemplo se eu preciso de uma classe externa que eu configurei no meu Configuration
   /*  @Autowired
    private SDKAWS sdkaws;
    */
    // primeira forma de fazer, usando o método construtor
   /* public HelloWordController(HelloWordService helloWordService) {
        this.helloWorldService = helloWordService;
        // em nenhum momento eu criei a instância da classe
        // new HelloWorldService, eu apenas recebi essa instância
        // quem passou essa classe pra mim foi o Spring
        // ele que fez a injeção de dependência
    }*/

    // pra resumir, existe duas formas de mandar o Spring injetar uma dependência, sem que precise instanciar
    // através do método construtor
    // e através do decorator @AutoWired

    // post, get, put, patch, options, head

    // GET /hello-word
    // sem declarar um endpoint específico para esse método
    @GetMapping
    public String helloWord(){
        return "Hello Course";
    }
    // teste com Service
    @GetMapping("/hello-service")
    public String falar(){
        return helloWorldService.helloWorld("Marcos");
    }
    // GET /hello-word/buscar-hello
    @GetMapping("/buscar-hello")
    public String helloWord2(){
        return "Hello Word!";
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World Post! " + body.getName() + " " +  id + " " + filter;
    }
}
