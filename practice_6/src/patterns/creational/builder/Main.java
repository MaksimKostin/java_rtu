package patterns.creational.builder;

public class Main {

    public static void main(String[] args) {

        SportCar car = new SportCar.Builder("Mercedes").setMaxSpeed(280).build();
        System.out.println(car);

    }
}
