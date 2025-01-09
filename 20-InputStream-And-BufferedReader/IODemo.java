import java.io.*;
import java.util.Scanner;

public class IODemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");

        // In older days
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader reader = new BufferedReader(in);

        Scanner reader = new Scanner(System.in);
        int num =  Integer.parseInt(reader.nextLine());
        
        System.out.println("You Entered: " + num);

        reader.close();
    }
}
