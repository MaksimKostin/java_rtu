package patterns.creational.abstrmethod.factories;

import patterns.creational.abstrmethod.Aircraft;
import patterns.creational.abstrmethod.Car;
import patterns.creational.abstrmethod.TransportFactory;
import patterns.creational.abstrmethod.russian_vehicle.Niva;
import patterns.creational.abstrmethod.russian_vehicle.TU134;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
