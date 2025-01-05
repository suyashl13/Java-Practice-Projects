class BasicCalculator {
    public int add(int ...args) {
        int result = 0;
        for (int number : args) {
            result += number;
        }
        return result;
    }

    public int subtract(int ...args) {
        int result = 0;
        for (int number : args) {
            result += number;
        }
        return result;
    }
}

// Single Inheritance.
class AdvancedCalculator extends BasicCalculator {
    public int multiply(int ...args) {
        int result = 0;
        for (int number : args) {
            result *= number;
        }
        return result;
    }

    public float divide(int a, int b) {
        return a / b;
    }
}

// MultiLevel Inheritance.
class VeryAdvanceCalculator extends AdvancedCalculator {
    public double power(int number, int power) {
        return Math.pow(power, number);
    }
}

// Java Does not support Multiple Inheritance.

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        VeryAdvanceCalculator veryAdvanceCalculator = new VeryAdvanceCalculator();

        System.out.println("Add: " + veryAdvanceCalculator.add(4,3));
        System.out.println("Sub: " + veryAdvanceCalculator.subtract(67, 12));
    }
}
