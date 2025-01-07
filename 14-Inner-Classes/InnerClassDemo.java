class OuterClass {

    public void show() {
        System.out.println("Showing in outer class...");
    }

    class InnerClass {
        public void config() {
            System.out.println("Configuring in inner class...");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.show();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass(); // In order to access inner class we need to create an object of outer class.
        innerClass.config();

    }    
}
