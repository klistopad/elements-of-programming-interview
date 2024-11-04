package prog.interview.ch8;

import java.util.List;
import java.util.Objects;

public class Ch83 {
    public Integer hasCyclicity(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < i; j++){
                if (Objects.equals(list.get(i), list.get(j))){
                    return j;
                }
            }
        }
        return null;
    }
}
