class Counter {
    public int count = 0;

    public  void increment() {
        count++;
    }

    @Override
    public String toString() {
        return "" + count;
    }
}

public class DeadlockHandlingDemo {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        
        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        
        System.out.println("Counter: " + counter);

    }
}
