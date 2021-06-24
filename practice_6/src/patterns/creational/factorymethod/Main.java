package patterns.creational.factorymethod;

public class Main {

    public static void main(String[] args) {
        CarSelector carSelector = CarSelector.INSTANCE;//реализация CarSelector через Singleton

        Car car = carSelector.getCar(RoadType.TRACK);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();
    }
}
