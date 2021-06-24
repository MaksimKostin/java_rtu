package patterns.creational.abstrmethod.factories;

import patterns.creational.abstrmethod.Aircraft;
import patterns.creational.abstrmethod.Car;
import patterns.creational.abstrmethod.TransportFactory;
import patterns.creational.abstrmethod.american_vehicle.Boeing777;
import patterns.creational.abstrmethod.american_vehicle.Cadillac;

public class AmericanFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Cadillac();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing777();
    }
}
