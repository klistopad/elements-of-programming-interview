package prog.interview.ch20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ch204 {

    public boolean process(int times, Runnable task){
        try (ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())){
            for (int i = 0; i < times; i++) {
                executorService.submit(task);
            }
        }

        return true;
    }
}
