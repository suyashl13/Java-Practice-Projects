class Human {
    int age;
    String name;
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    void showAllDetails() {
        System.out.println(
            "Name\t\t\t" +
            "Age\t\t" +
            "Salary\t\t"
        );
        System.out.println(
            this.name + "\t\t" +
            this.age + "\t\t" +
            this.salary + "\t\t"
        );
    }
}


public class EncapsulationDemo {
    public static void main(String[] args) {
        Human suyash = new Human();

        suyash.name = "Suyash Lawand";
        suyash.age = 24;
        suyash.setSalary(760000);

        suyash.showAllDetails();
    }
}
