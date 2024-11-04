package prog.interview.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ch181 {

    public int calculateTimeToCompleteTasks(List<Integer> tasks){
        List<Integer> evenTasks = new ArrayList<>(tasks);

        if (tasks.size() % 2 != 0){
            evenTasks.add(0);
        }

        Collections.sort(evenTasks);

        List<Integer> timeForWorkers = new ArrayList<>();

        for (int i = 0; i < evenTasks.size() / 2; i++) {
            Integer time = evenTasks.get(i) + evenTasks.get(evenTasks.size() - 1 - i);
            timeForWorkers.add(time);
        }

        return Collections.max(timeForWorkers);
    }
}
