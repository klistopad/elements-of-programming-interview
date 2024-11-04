package prog.interview.ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ch122 {

    public List<Integer> findIndexes(List<Integer> list){
        List<Integer> indexes = new ArrayList<>();
        findIndexes(list, 0, list.size(), indexes);
        Collections.sort(indexes);

        return indexes;
    }

    private void findIndexes(List<Integer> list, int starIndex, int endIndex, List<Integer> matchedIndexes){
        int left = starIndex;
        int right = endIndex - 1;

        if (left > right){
            return;
        }

        int mid = left + ((right - left) / 2);
        int midVal = list.get(mid);

        if (midVal == mid){
            matchedIndexes.add(mid);
            findIndexes(list, starIndex, mid,  matchedIndexes);
            findIndexes(list, mid + 1, endIndex, matchedIndexes);
        } else if (midVal < mid){
            findIndexes(list, mid + 1, endIndex, matchedIndexes);
        } else {
            findIndexes(list, starIndex, mid, matchedIndexes);
        }
    }
}
