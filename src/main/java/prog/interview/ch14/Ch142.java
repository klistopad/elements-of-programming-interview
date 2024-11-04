package prog.interview.ch14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ch142 {

    public List<Integer> merge(List<Integer> list1, List<Integer> list2){
        List<Integer> merged = new ArrayList<>(list1);

        int list1ValueSize = list1.indexOf(null);
        int list1InsertIndex = list1ValueSize + list2.size() - 1;

        Iterator<Integer> list1Iterator = list1.subList(0, list1ValueSize).reversed().iterator();
        Iterator<Integer> list2Iterator = list2.reversed().iterator();

        Integer list1Val = null;
        Integer list2Val = null;

        for (int i = list1InsertIndex; i >= 0; i--) {
            if (list1Val == null && list1Iterator.hasNext()) {
                list1Val = list1Iterator.next();
            }

            if (list2Val == null && list2Iterator.hasNext()){
                list2Val = list2Iterator.next();
            }

            if (list1Val == null && list2Val != null){
                merged.set(i, list2Val);
                list2Val = null;
                continue;
            }

            if (list1Val != null && list2Val == null){
                merged.set(i, list1Val);
                list1Val = null;
                continue;
            }

            if (list1Val > list2Val) {
                merged.set(i, list1Val);
                list1Val = null;

            } else {
                merged.set(i, list2Val);
                list2Val = null;
            }
        }
        return merged;
    }
}
