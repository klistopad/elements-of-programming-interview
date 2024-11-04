package prog.interview.ch8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ch81 {
    public List<Integer> merge(List<Integer> list1, List<Integer> list2){
        Iterator<Integer> list1Iterator = list1.iterator();
        Iterator<Integer> list2Iterator = list2.iterator();
        ArrayList<Integer> res = new ArrayList<>();

        Integer val1 = null;
        Integer val2 = null;

        do {
            if (list1Iterator.hasNext() && val1 == null){
                val1 = list1Iterator.next();
            }

            if (list2Iterator.hasNext() && val2 == null){
                val2 = list2Iterator.next();
            }

            if (val1 != null && val2 != null){
                if (val1 < val2){
                    res.add(val1);
                    val1 = null;
                } else {
                    res.add(val2);
                    val2 = null;
                }
            } else if (val1 != null && val2 == null){
                res.add(val1);
                val1 = null;
            } else if (val1 == null && val2 != null){
                res.add(val2);
                val2 = null;
            }

        } while (val1 != null || val2 != null);

        return res;
    }
}
