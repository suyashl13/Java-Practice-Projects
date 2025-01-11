import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        int SIZE = 10_000;

        List<Integer> intList = new ArrayList<Integer>(SIZE);
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            intList.add(random.nextInt(1000));
        }

        long startSeq = System.currentTimeMillis();
        int sum1 = intList.stream()
                        .map(i -> i % 2)
                        .reduce(0, (c, e) -> c + e);
        long endSeq = System.currentTimeMillis();
        
        int sum2 = intList.stream()
                        .mapToInt(i -> i % 2)
                        .sum();
        long startParallel = System.currentTimeMillis();
        int sum3 = intList.parallelStream()
                        .mapToInt(i -> i % 2)
                        .sum();
        long endParallel = System.currentTimeMillis();

        System.out.println("Sequential Addition (" + (endSeq - startSeq)  +") : " + sum1 );
        System.out.println("Parallel Addition (" + (endParallel - startParallel)  +") : " + sum3 );
    }
}
