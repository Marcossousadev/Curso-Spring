package com.marcossousadev.course_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

// decorator que abstraí algumas configurações
// @Configuration, permite que alguns métodos implementem bins
// @EnableAutoConfiguration, permite abstrações das configurações do Spring
// @ComponentScan, permite que escanei todo o projeto, fazendo injeção de dependências;
@SpringBootApplication
@Profile("dev")
public class CourseSpringApplication {
	// método  inicializador
	public static void main(String[] args) {
		SpringApplication.run(CourseSpringApplication.class, args);
	}

}
