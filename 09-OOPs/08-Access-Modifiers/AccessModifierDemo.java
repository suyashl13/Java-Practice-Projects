class A {
    private int a; // Accessable in class only.
    protected int b; // Accessable in subclasses only.
    public int c; // Accessable in all environment.
}

class B extends A {
    B() {
        this.b = 23;
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {  
        A a = new A();
        a.c = 22;

        System.out.println(a.c);
        System.out.println(new B().b);
    }
}
