package patterns.creational.factorymethod.cars;

import patterns.creational.factorymethod.Car;

public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("Max speed of 300 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }
}
