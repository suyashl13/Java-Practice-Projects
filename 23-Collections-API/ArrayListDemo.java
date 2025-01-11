import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

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

        // HashSet Demo. HashSet is a collection that does not allow duplicate values.
        HashSet<Integer> intHashSet = new HashSet<Integer>();

        for (int i = 0; i < 12; i++) {
            intHashSet.add(i * 6);
        }

        // Print all values in collection.
        index = 0;
        for (Integer integer : intHashSet) {
            System.out.println(index + " * " + "6 = " +  integer);
            index++;
        }

        // Add duplicate value.
        intHashSet.add(0);

        // Print all values in collection.
        index = 0;
        for (Integer integer : intHashSet) {
            System.out.println(index + " * " + "6 = " +  integer);
            index++;
        }

        // Remove duplicate value.
        intHashSet.remove(0);

        // Print all values in collection.
        index = 0;
        for (Integer integer : intHashSet) {
            System.out.println(index + " * " + "6 = " +  integer);
            index++;
        }

        // Check if value exists in collection.
        System.out.println("Does 36 exist in collection? " + intHashSet.contains(36));


        // TreeSet Demo. TreeSet is a collection that does not allow duplicate values and sorts the values.
        TreeSet<Integer> intTreeSet = new TreeSet<Integer>();
        
        for (int i = 0; i < 12; i++) {
            intTreeSet.add(i * 6);
        }

        // Print all values in collection.
        index = 0;
        for (Integer integer : intTreeSet) {
            System.out.println(index + " * " + "6 = " +  integer);
            index++;
        }
        
    }
}