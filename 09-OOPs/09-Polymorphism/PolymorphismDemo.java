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

    public double power(int number, int power) {
        return Math.pow(power, number);
    }
}

// MultiLevel Inheritance.
class VeryAdvanceCalculator extends AdvancedCalculator {
    public double power(int number, int power) {
        System.out.println("Power method from very advanced calculator just ran.");
        return Math.pow(power, number) + 1;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator;
        
        advancedCalculator = new VeryAdvanceCalculator();
        double result = advancedCalculator.power(1, 2);

        System.out.println(result);
        
    }
}
