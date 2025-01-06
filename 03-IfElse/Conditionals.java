public class Conditionals {

    public static void main(String[] args) {
        int age = 25;
        boolean isAdult = age >= 18;
        
        if (isAdult) {
            System.out.println("User is adult");
        } else {
            System.out.println("User is not adult");
        }
        
        // Print greater number
        int num1 = 10;
        int num2 = 20;
        
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        // Ternary operator
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}