package com.spring.various.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig1.class);
        Programmer1 ourWorker = context.getBean(Programmer1.class);
        ourWorker.doCoding();
    }
}
