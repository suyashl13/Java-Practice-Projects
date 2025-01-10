import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {

    public static void main(String[] args) {
        Collection<Integer> intCollection = new ArrayList<Integer>();

        for (int i = 0; i < 12; i++) {
            intCollection.add(i * 6);
        }

        // Print all values in collection.
        int index = 0;
        for (Integer integer : intCollection) {
            System.out.println(index + " * " + "6 = " +  integer);
            index++;
        }

    }
}