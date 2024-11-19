package prog.interview.ch20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

class Ch204Test {

    @Test
    void process() {
        AtomicInteger atomicInteger = new AtomicInteger();
        Runnable task = () -> {
            System.out.printf("Task number: %d; thread: %s%n", atomicInteger.incrementAndGet(), Thread.currentThread().getName());
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(10));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Assertions.assertTrue(new Ch204().process(100, task));
    }
}