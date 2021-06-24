package patterns.creational.factorymethod.cars;

import patterns.creational.factorymethod.Car;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Max speed of 260 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 2 sec");
    }
}
