package org.example;

public class Alien {

    String name;
    private int age;
    private Computer computer;

    Alien(String name, int age, Computer computer){
        this.name = name;
        this.age = age;
        this.computer = computer;
    }


    public Alien() {
        System.out.println("Alien object created...");
    }

    public void code() {
        System.out.println("Alien is writing code...");
    }

    public int getAge() {
        System.out.println("Getter Called!");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called!");
        this.age = age;
    }


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
