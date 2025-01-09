import java.util.Scanner;


class BadNumberException extends Exception {
    BadNumberException(int number) {
        super("Dirty number: " + number);
    }
}


public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        int BAD_NUMBER = 69;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter no 1: ");
            int number1 = Integer.parseInt(
                    sc.nextLine());
            System.out.println("Enter no 2: ");
            int number2 = Integer.parseInt(
                    sc.nextLine());

            if (number2 == 0) {
                throw new ArithmeticException("Dont divide it by zero!");
            } if (number1 == BAD_NUMBER || number2 == BAD_NUMBER) {
                throw new BadNumberException(BAD_NUMBER);
            }

            System.out.println("Division: " + number1 / number2);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero...");
        } catch (BadNumberException e) {
            System.out.println("Dont pass bad numbers...");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!!!");
        } finally {
            sc.close();
        }
    }
}