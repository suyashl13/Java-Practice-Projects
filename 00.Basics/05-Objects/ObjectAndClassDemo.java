class Calculator {

    final float pi = 3.14f; // constant variable (immutable and global for class)

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }   

    public int div(int a, int b) {
        return a / b;
    }

}

public class ObjectAndClassDemo {
    public static void main(String[] args) {
        System.out.println("Demo of calculator class");


        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.sub(10, 20));
        System.out.println(c.mul(10, 20));
        System.out.println(c.div(10, 20));
    }
}
