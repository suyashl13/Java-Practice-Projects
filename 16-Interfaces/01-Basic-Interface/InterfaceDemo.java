interface Car {
    public static final int maxSpeed = 100;
    public int wheels = 4;

    public void drive();
    public void stop();

}

class Audi implements Car {
    public void drive() {
        System.out.println("Audi is driving");
    }

    public void stop() {
        System.out.println("Audi is stopped");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car car = new Audi();
        car.drive();
        car.stop();
    }   
}
