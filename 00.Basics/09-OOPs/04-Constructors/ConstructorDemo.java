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

    // Constructor Overloaded using Parameterized constructor.
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

    public void display() {
        System.out.println("========== " + name + " ===========");
        System.out.println("Name\t\t\tAge\t\tSalary\t\t");
        System.out.println(name+"\t\t\t" + age + "\t\t" + salary + "\t\t");

    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Initialize human object using default constructor.
        Human defaultHuman = new Human();
        Human suyash = new Human(24, "Suyash Lawand");

        defaultHuman.display();
        suyash.display();
    }    
}
