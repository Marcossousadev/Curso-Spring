package com.marcossousadev.course_spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// usando o lombok para ajudar na criação de código boilerplate
@Getter
@Setter
@AllArgsConstructor
public class User {

    private String name;
    private String email;
}
