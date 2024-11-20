package prog.interview.ch20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

class Ch205Test {

    @Test
    void transfer() {
        Ch205.Account account1 = new Ch205.Account(1, 100_000);
        Ch205.Account account2 = new Ch205.Account(2, 100_000);

        Runnable task = ()-> {
            boolean transferDirection = ThreadLocalRandom.current().nextBoolean();
            int amount = ThreadLocalRandom.current().nextInt(100);

            if (transferDirection){
                Ch205.AccountManager.move(account1, account2, amount);
            } else {
                Ch205.AccountManager.move(account2, account1, amount);
            }
        };

        try (ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())){
            for (int i = 0; i < 100_000; i++){
                executorService.submit(task);
            }
        }

        System.out.printf("Account1 balance: %,d%n", account1.balance);
        System.out.printf("Account2 balance: %,d%n", account2.balance);

        Assertions.assertEquals(200_000, account1.balance + account2.balance);
    }
}