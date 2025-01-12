import java.util.ArrayList;

class Person {
    private String name;
    private int age;


    Person(String name) {
        this.name = name;
        this.age = 0;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
    
}

public class ConstructorReference {
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

        // Constructor reference
        names.stream()
            .map(Person::new)
            .forEach(p -> System.out.println(p.getName()));

    }    
}