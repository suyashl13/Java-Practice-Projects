abstract class Car {
    public abstract void drive();

    public abstract void stop();
}

public class AbstractAnonymousClassDemo {

    public static void main(String[] args) {
        Car car = new Car() {
            public void drive() {
                System.out.println("Car is driving");
            }

            public void stop() {
                System.out.println("Car is stopped");
            }
        };

        car.drive();
        car.stop();
    }
}