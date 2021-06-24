package patterns.creational.builder;

public class SportCar {
    private String brand;
    private int maxSpeed = 200;
    private String color = "black";

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public static class Builder{
        private final SportCar car;

        public Builder(String brand){  // бренд добавили в коструктор тк бренд вводить обязательно
            car = new SportCar();
            car.brand = brand;
        }


        public Builder setMaxSpeed(int maxSpeed) {
            car.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setColor(String color) {
            car.color = color;
            return this;
        }

        public SportCar build(){
            return car;
        }

    }

    @Override
    public String toString() {

        return "Brand: " + brand + "\n" +
                "Color: " + color + "\n" +
                "Max speed: " + maxSpeed + "\n";
    }
}
