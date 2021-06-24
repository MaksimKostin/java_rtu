package com.company;

public class SingletonRealization2 {
    private static final SingletonRealization2 instance = new SingletonRealization2();

    private SingletonRealization2(){ }

    public static SingletonRealization2 getInstance(){ /*1. Ленивую инициализацию (Объект instance будет создан
                                                         classloader-ом во время инициализации класса)
                                                         2. Отсутствует возможность обработки исключительных
                                                         ситуаций(exceptions) во время вызова конструктора. */
        return instance;
    }

    public void getSingletonMethod(){
        System.out.println("Вывели из единственного экземпляра объекта 2-го Singleton");
    }
}
