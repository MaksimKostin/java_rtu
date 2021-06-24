package com.spring.various.target;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);
        Programmer2 ourWorker = context.getBean(Programmer2.class);
        ourWorker.doCoding();
    }
}
