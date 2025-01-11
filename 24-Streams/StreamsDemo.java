import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        // Add Random numbers to the list.
        for (int i = 0; i < 10; i++) {
            intList.add((int) (Math.random() * 100));
        }

        // Print all elements in the list.
        intList.forEach((element) -> System.out.print(element + " "));

        // Filter Odd numbers
        Stream<Integer> numberStream = intList.stream();
        Stream<Integer> evenNumbersStream =  numberStream.filter(n -> n % 2 == 0);
        Stream<Integer> evenNumberPlusTwo = evenNumbersStream.map(n -> n + 2);
        int additionOfAll = evenNumberPlusTwo.reduce(0 , (c , e) -> c + e);

        System.err.println("\nEven Numbers + 2 and addition of all : " + additionOfAll);

        // Above Operation in short hand!
        ArrayList<Integer> newIntList = new ArrayList<Integer>();

        // Add random numbers in list.
        for (int i = 0; i < 10; i++) {
            newIntList.add((int) (Math.random() * 1000));
        }
        
        int result =  newIntList.stream()
            .filter(i -> i % 2 == 0)
            .map(i -> i + 2)
            .reduce(0 , (c, e) -> c + e);

        System.err.println("\nEven Numbers + 2 and addition of all (Short-Hand Demo) : " + result);

    }
}
