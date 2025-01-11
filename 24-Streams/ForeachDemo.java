import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;


public class ForeachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            intArrayList.add((int) (Math.random() * 100));
        }
        
        // Print all values in collection using for loop in detail.
        Consumer<Integer> printConsumer = (Integer integer) -> {
            System.out.println(integer);
        };

        intArrayList.forEach(printConsumer);

        // Shorter way to write the above code.
        intArrayList.forEach((Integer integer) -> System.out.println(integer));


        // Sorting (Just fpr practice)
        Collections.sort(intArrayList);
    }
}
