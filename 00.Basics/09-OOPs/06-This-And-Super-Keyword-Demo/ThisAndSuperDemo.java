class A {
    A() {
        System.out.println("In default constructor of A class.");
    }

    A(int a) {
        System.out.println("In parameterized constructor of A class. Has value " + a);
    }
}

class B extends A {
    B() {
        System.out.println("In default constructor of B class.");
    }

    B(int b) {
        super(b);
        System.out.println("In parameterized constructor of B class. Has value " + b);
    }

}

public class ThisAndSuperDemo {
    public static void main(String[] args) {
        new B();
        /*
         * Output : 
         * In default constructor of A class.
         * In default constructor of B class.
         * 
         * Because B has super() even if not mentioned and calls 
         * constructor of A class
         */

        new B(55);
        /*
         * Output:
         * In parameterized constructor of A class. Has value 55
         * In parameterized constructor of B class. Has value 55
         * 
         * Because we are explictly telling to use Class A's 
         * parameterized constructor using super(int) constructor.
         */
    }
}
