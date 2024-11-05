package prog.interview.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ch182 {

    public int findMinWaitingTime(List<Integer> tasks){
        List<Integer> localTasks = new ArrayList<>(tasks);

        Collections.sort(localTasks);

        int totalWaitingTime = 0;
        int currentWaitingTime = 0;

        for (int i = 0; i < localTasks.size() - 1; i++){
            currentWaitingTime += localTasks.get(i);
            totalWaitingTime += currentWaitingTime;
        }

        return totalWaitingTime;
    }
}
