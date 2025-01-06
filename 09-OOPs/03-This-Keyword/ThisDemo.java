class Human {
    int age;
    String name;
    private float salary;

    Human() {
        // This keyword refers global variables of class.
        this.name = "Unnamed";
        this.salary = 0;
        this.age = 0;
    }

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Human human = new Human(); // Initialized human using default values using default constructor.
        System.out.println(
            human.name + "\t\t" +
            human.age
        );
    }
}
