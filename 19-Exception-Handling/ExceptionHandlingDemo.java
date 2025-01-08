import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter no 1: ");
            int number1 = Integer.parseInt(
                sc.nextLine()
            );
            System.out.println("Enter no 2: ");
            int number2 = Integer.parseInt(
                sc.nextLine()
            );

            System.out.println("Division: " + number1 / number2);   
        } catch (Exception e) {
            System.out.println("Something went wrong!!!");
        } finally {
            sc.close();
        }

    }
}