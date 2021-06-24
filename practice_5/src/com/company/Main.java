package com.company;

public class Main {

    public static void main(String[] args) {
        SingletonRealization1.getInstance().getSingletonMethod();
        SingletonRealization2.getInstance().getSingletonMethod();
        SingletonRealization3.getInstance().getSingletonMethod();
        SingletonRealization4.INSTANCE.getSingletonMethod();
        // создание объекта класса с целью не писать SingletonRealization4.INSTANCE...
        SingletonRealization4 singleton = SingletonRealization4.INSTANCE;
        singleton.getSingletonMethod();
    }
}
