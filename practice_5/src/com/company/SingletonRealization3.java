package com.company;

public class SingletonRealization3 {
    private static volatile SingletonRealization3 instance;

    private SingletonRealization3(){ }

    public static synchronized SingletonRealization3 getInstance(){
        if(instance == null){
            synchronized (SingletonRealization3.class){ /* Решили проблемы с ненужностью синхронизированного метода
                                                           (открыли return для потоков если объект уже создан и нет
                                                           смысла ждать другого потока */
                instance = new SingletonRealization3();
            }
        }
        return instance;
    }

    public void getSingletonMethod(){
        System.out.println("Вывели из единственного экземпляра объекта 3-го Singleton");
    }
}
