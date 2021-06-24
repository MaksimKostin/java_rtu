package patterns.creational.abstrmethod.american_vehicle;

import patterns.creational.abstrmethod.Car;

public class Cadillac implements Car {
    @Override
    public void drive() { System.out.println("Max speed of 150 km/h"); }

    @Override
    public void stop() { System.out.println("Stopped at 4 sec"); }
}
