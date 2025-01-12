import java.util.ArrayList;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Tom");
        names.add("Jerry");
        names.add("Donald");
        names.add("Mickey");
        names.add("Mini");
        

        // Method reference to an instance method of an arbitrary object of a particular type
        names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

    }    
}
