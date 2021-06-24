package patterns.creational.abstrmethod.russian_vehicle;

import patterns.creational.abstrmethod.Car;

public class Niva implements Car {
    @Override
    public void drive() { System.out.println("Max speed of 120 km/h"); }

    @Override
    public void stop() { System.out.println("Stopped at 5 sec"); }
}
