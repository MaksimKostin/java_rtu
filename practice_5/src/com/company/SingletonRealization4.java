package com.company;

// Enum singleton - the preferred approach
public enum SingletonRealization4 { // ==== public final class SingletonRealization4
    INSTANCE; // ==== public final static SingletonRealization4 INSTANCE = new SingletonRealization4();
    // ==== конструктор сразу является private

    public void getSingletonMethod(){
        System.out.println("Вывели из единственного экземпляра объекта 4-го Singleton");
    }
}
