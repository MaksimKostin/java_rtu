package patterns.creational.abstrmethod;

import patterns.creational.abstrmethod.factories.AmericanFactory;
import patterns.creational.abstrmethod.factories.RussianFactory;

public class Main {

    public static void main(String[] args) {
        TransportFactory russian = new RussianFactory();
        TransportFactory american = new AmericanFactory();

        Aircraft tu134= russian.createAircraft();
        tu134.flight();

        Car niva = russian.createCar();
        niva.drive();

        System.out.println();

        Aircraft boeing777= american.createAircraft();
        boeing777.flight();

        Car cadillac = american.createCar();
        cadillac.drive();


    }
}
