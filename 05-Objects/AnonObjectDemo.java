class A {
    public String name;

    A() {
        System.out.println("Object for A created!");
    }
}

public class AnonObjectDemo {
    public static void main(String[] args) {
        new A(); // Anonymus object.
    }
}
