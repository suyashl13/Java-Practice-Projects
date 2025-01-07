class A {
    public void show() {
        System.out.println("In A show");
    }
}


public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show() {
                System.out.println("In Anonymous show");
            }
        };

        obj.show(); // O/P: In Anonymous show
    }    
}
