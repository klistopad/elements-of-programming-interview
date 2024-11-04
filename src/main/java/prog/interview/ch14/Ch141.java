package prog.interview.ch14;

import java.util.*;

public class Ch141 {

    public List<Integer> findIntersection(List<Integer> list1, List<Integer> list2){
        List<Integer> listToIterate;
        List<Integer> listToSearch;

        if (list1.size() > list2.size()){
            listToIterate = list2;
            listToSearch = list1;
        } else {
            listToIterate = list1;
            listToSearch = list2;
        }

        List<Integer> intersection = new ArrayList<>();

        int startIndex = 0;
        for (int i = 0; i < listToIterate.size(); i++){
            Integer val = listToIterate.get(i);

            if (i > 0 && listToIterate.get(i - 1).equals(val)){
                continue;
            }

            int index = Collections.binarySearch(listToSearch.subList(startIndex, listToSearch.size()), val);

            if (index >= 0){
                intersection.add(val);
                startIndex = index;
            }
        }
        return intersection;
    }
}
