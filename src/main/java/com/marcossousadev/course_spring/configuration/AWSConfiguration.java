package com.marcossousadev.course_spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// a classe de configuração é basicamente utilizada no Spring para definir Beans e instância de classes
//  no contexto de uma aplicação Spring
// o Spring consegue fazer o gerenciamento de classes que são componentes do Spring
// que foram criadas dentro da nossa aplicação, que foram mapeadas diretamente
// mas as vezes, a gente precisa que o Spring faça injeção de dependências de classes externas, que veio de outra
// biblioteca que não tá dentro do Spring, por exemplo a biblioteca do SDK da oracle ou o SDK da AWS
// mesmo que eu tenha baixado a dependência eu preciso fazer o mapaeamento direto para o Spring
// pq nessa depencência pode vim várias classes
@Configuration
public class AWSConfiguration {
    // criar instância de classes que não podem ser gerenciadas pelo Spring
   /* @Bean
    public SDKAWS sdkAws() {
        return new SDKAWS(); // exemplo criação da instância SDK da AWS
    } */

   /* @Bean
    public Transport myService(){
        return new Car();
    } */

    // Transport -> interface
    // Car -> implementação

    // se eu chamar em dois lugares diferentes, vai ser a mesma instância
    // single-too
}
