package prog.interview.ch20;

import java.util.concurrent.atomic.AtomicInteger;

public class Ch202 {
    private int counter;
    private final AtomicInteger atomicCounter = new AtomicInteger();

    public int incrementConcurrently(int iterationCount) throws Exception {

        Runnable runnable = ()->{
            for (int i = 0; i < iterationCount; i++) {
                this.counter++;
                this.atomicCounter.incrementAndGet();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.printf("counter: %,d%n", counter);
        System.out.printf("atomicCounter: %,d%n", atomicCounter.get());

        return this.atomicCounter.get();
    }
}
