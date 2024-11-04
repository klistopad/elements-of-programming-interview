package prog.interview.ch15;

import java.util.Iterator;
import java.util.NavigableSet;

public class Ch151 {

    public boolean isValidBST(NavigableSet<Integer> set){
        Iterator<Integer> iterator = set.iterator();

        Integer prev = iterator.next();
        while (iterator.hasNext()){
            Integer current = iterator.next();
            if (prev > current){
                return  false;
            }
            prev = current;
        }

        return true;
    }
}
