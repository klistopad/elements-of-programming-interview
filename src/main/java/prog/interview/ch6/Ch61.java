package prog.interview.ch6;

import java.util.Arrays;

public class Ch61 {

    public int[] rearrange(int[] array, int index){
         int pivot = array[index];
        int currentIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < pivot) {
                int tmp = array[currentIndex];
                array[currentIndex] = array[i];
                array[i] = tmp;
                currentIndex++;
            }
        }

        for (int i = currentIndex; i < array.length; i++) {
            if (array[i] == pivot){
                int tmp = array[currentIndex];
                array[currentIndex] = array[i];
                array[i] = tmp;
                currentIndex++;
            }
        }

        return array;

    }
}
