package com.spring.various.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig1 {

    @Bean
    public Programmer1 programmer(){
        return new Middle1();
    }

}
