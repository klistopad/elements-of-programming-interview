package prog.interview.ch15;

import java.util.NavigableSet;

public class Ch152 {

    public Integer findGreater(NavigableSet<Integer> set, Integer val){
        return set.higher(val);
    }

}
