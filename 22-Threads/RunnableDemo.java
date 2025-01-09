class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("A : " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable objA = new A();
        Runnable objB = () -> {
            for (int i = 0; i < 40; i++) {
                System.out.println("B : " + i);
            }    
        };


        new Thread(objA).start();
        new Thread(objB).start();
    }   
}
