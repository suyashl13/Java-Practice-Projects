import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<String, Integer>();

        studentMarks.put("Suyash", 98);
        studentMarks.put("Rahul", 95);
        studentMarks.put("Rohit", 92);
        studentMarks.put("Rahul", 90);
        

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }

        // Check if key exists in map.
        System.out.println("Does Suyash exist in map? " + studentMarks.containsKey("Suyash"));

        // Check if value exists in map.
        System.out.println("Does 95 exist in map? " + studentMarks.containsValue(95));

        // Remove key from map.
        studentMarks.remove("Rahul");

        // Insert duplicate key.
        studentMarks.put("Rohit", 92); // This will replace the value of Rohit.

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }

    }
}
