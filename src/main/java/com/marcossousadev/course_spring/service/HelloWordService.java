package com.marcossousadev.course_spring.service;

import org.springframework.stereotype.Service;

// aqui dentro do Service colocamos as regras de negócio, o que foi definido como funciona pelo nosso PO (Product Owner);
@Service
public class HelloWordService {

    public String helloWorld(String name){
        return "Hello World " + name;
    }
}
