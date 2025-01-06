class Animal {
    public void speak() {
        System.out.println("Animal is speaking...");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Dog is barking...");
    }

    public void wagTail() {
        System.out.println("Dog is wagging its tail...");
    }
}

public class UpcastingAndDownCastingDemo {
    public static void main(String[] args) {
        // Upcasting: Subclass object is assigned to a superclass reference
        Animal animal = new Dog();
        animal.speak(); // Calls the overridden method in Dog class

        // Downcasting: Casting the superclass reference back to subclass
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            dog.wagTail(); // Access subclass-specific method
        } else {
            System.out.println("Downcasting is not possible.");
        }
    }
}
