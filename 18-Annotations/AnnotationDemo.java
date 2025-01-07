class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    // This is an annotation. 
    // It is used to check if the method is actually overriding the method from the parent class.
    @Override
    public void show() {
        System.out.println("In B show");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show(); // O/P: In B show
    }
}
