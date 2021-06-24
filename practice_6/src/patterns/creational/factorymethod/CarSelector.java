package patterns.creational.factorymethod;

import patterns.creational.factorymethod.cars.BMW;
import patterns.creational.factorymethod.cars.BMW_Competition;
import patterns.creational.factorymethod.cars.Porsche;

//фабрика по созданию авто
public enum CarSelector {
    INSTANCE;

    public Car getCar(RoadType roadType){
        Car car = null;

        switch (roadType){
            case CITY:
                car = new BMW();
                break;
            case TRACK:
                car = new BMW_Competition();
                break;
            case OFF_ROAD:
                car = new Porsche();
                break;
        }
        return car;
    }
}
