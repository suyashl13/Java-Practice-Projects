@FunctionalInterface // Has only one abstract method.
interface FunctionalInterfaceExample {
    void calculate();
}

@FunctionalInterface
interface Adder {
    int add(int number1, int number2);    
}

public class FunctionalInterfaceDemo {
    
    public static void main(String[] args) {
        FunctionalInterfaceExample obj = () -> {
            System.out.println("Calculate Method called!");
        };
        
        obj.calculate();

        Adder adder = (number1, number2) -> {
            return number1 + number2;
        };

        System.out.println("Adder Gave Result:  " + adder.add(1, 0));
    }
}
