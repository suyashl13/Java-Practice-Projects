class A extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
                System.out.println("Running A.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Running B");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        A obA = new A();
        B b = new B();

        // Set Priority.
        b.setPriority(Thread.MAX_PRIORITY);

        // Get Priority.
        System.out.println("Thread priority of B is: " + b.getPriority());

        obA.start();
        b.start();
    }
}
