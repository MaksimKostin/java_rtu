package com.spring.various.target;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig2 {

    @Bean
    public Programmer2 programmer(){
        return new Middle2();
    }

}
