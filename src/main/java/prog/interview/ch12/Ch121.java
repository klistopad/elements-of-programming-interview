package prog.interview.ch12;

import java.util.Collections;
import java.util.List;

public class Ch121 {
    public int binarySearch(List<Integer> list, int k){
        int index = Collections.binarySearch(list, k);

        if (index < 0){
            return index;
        }

        while (index > 0 && list.get(index).equals(list.get(index - 1))){
            index--;
        }

        return index;
    }
}
