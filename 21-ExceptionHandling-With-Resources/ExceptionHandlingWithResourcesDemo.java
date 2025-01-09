import java.util.Scanner;

public class ExceptionHandlingWithResourcesDemo {
    public static void main(String[] args) {
        // In order to do this resource should be auto closable.
        try (Scanner scanner = new Scanner(System.in)) {
            int number =  Integer.parseInt(scanner.nextLine());
            System.out.println("Number * 2 : " + number * 2);
        } catch (Exception e) {
            System.out.println("An Exception occoured!");
            System.out.println(e.getMessage());
        }
    }        
}
