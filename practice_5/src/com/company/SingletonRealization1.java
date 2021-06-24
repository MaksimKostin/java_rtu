package com.company;

public class SingletonRealization1 {
    private static SingletonRealization1 instance;

    private SingletonRealization1(){ }

    public static synchronized SingletonRealization1 getInstance(){
        if(instance == null){
            instance = new SingletonRealization1(); /* 1. Ленивая инициализация (объект создатся еcли хоть раз вызовут метод"
                                                       2. После первого вызова метода теряется смысл synchronized*/
        }
        return instance;
    }

    public void getSingletonMethod(){
        System.out.println("Выввели из единственного экземпляра объекта");
    }
}
