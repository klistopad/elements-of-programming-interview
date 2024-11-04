package prog.interview.ch8;

import java.util.Collections;
import java.util.List;

public class Ch82 {
    public List<Integer> reverseSubList(List<Integer> list, int s, int f){
        for (int i = s - 1, j = f - 1; i < j; i++, j--){
            Collections.swap(list, i, j);
        }
        return list;
    }
}
