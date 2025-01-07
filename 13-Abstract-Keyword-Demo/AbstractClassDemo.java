abstract class Car {

    // Abstract method. Cannot have body.
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing music...");
    }
    
}

abstract class WagonR extends Car { // Abstract class. Cannot be instantiated.
    // Override abstract method
    // Abstract method cannot be overriden
    public void drive() {
        System.out.println("WagonR is driving...");
    }
}

class UpdatedWagonR extends WagonR { // Concrete class
    @Override
    public void fly() {
        System.out.println("WagonR is flying...");
    }
}   

public class AbstractClassDemo {

    public static void main(String[] args) {
        Car wagonR = new UpdatedWagonR(); // Dynamic method dispatch.
        wagonR.drive();
        wagonR.playMusic();
        wagonR.fly();
    }
}