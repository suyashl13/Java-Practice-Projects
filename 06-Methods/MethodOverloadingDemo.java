class Calculator {
    // Method Overloading.
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded using no. of parameters.
    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addTwo = calculator.add(1, 2);
        int addThree = calculator.add(1, 2, 3);

        System.out.println("Add Two: " + addTwo);
        System.out.println("Add Three: " + addThree);
    }
}
