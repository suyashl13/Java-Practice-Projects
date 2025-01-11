import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class OptionalClassDemo {
    public static void main(String[] args) {
        List<String> names = new  ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");
        names.add("Jill");


        // Check if the list contains a name.
        Optional<String> name = names.stream()
                                    .filter(n -> n.startsWith("J"))
                                    .findFirst();
                                    
        if (name.isPresent()) {
            System.out.println("Name starting with J: " + name.get());
        } else {
            System.out.println("No name starting with J found.");
        }

        // Or

        System.out.println("Name starting with J: " + name.orElse("No name starting with J found."));

        // This can be used to avoid null pointer exceptions. Use Optional class to check if the value is present or not.
    }    
}
