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

    public float divide(int a, int b) {
        System.out.println("Running in Class: VeryAdvanceCalculator");
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}


public class MethodOverridingDemo {
    public static void main(String[] args) {
        System.out.println(
            "Advance calculator dividing 12/4 =>" + (new AdvancedCalculator().divide(12, 4))
        );

        System.out.println(
            "Very Advance calculator dividing 12/4 =>" + (new VeryAdvanceCalculator().divide(12, 4))
        );
    }
}
