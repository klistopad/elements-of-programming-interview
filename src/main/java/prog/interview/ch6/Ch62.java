package prog.interview.ch6;

import java.util.ArrayList;

public class Ch62 {
    int[] increment(int[] array){
        int incrementBy = 1;
        for (int i = array.length - 1; i > -1; i--){
            if (array[i] < 9 && incrementBy == 1){
                array[i]++;
                incrementBy = 0;
            }
            if (array[i] == 9 && incrementBy == 1){
                array[i] = 0;
            }
        }
        return array;
    }

    ArrayList<Integer> incrementV2(ArrayList<Integer> list){
        int incrementBy = 1;
        for (int i = list.size() - 1; i > -1; i--){
            if (list.get(i) < 9 && incrementBy == 1){
                Integer val = list.get(i);
                val++;
                list.set(i, val);
                incrementBy = 0;
            }
            if (list.get(i) == 9 && incrementBy == 1){
                list.set(i, 0);
            }
        }
        if (incrementBy == 1){
            list.addFirst( 1);
        }

        return list;
    }
}
