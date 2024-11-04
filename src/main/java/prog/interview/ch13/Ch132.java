package prog.interview.ch13;

import java.util.HashMap;
import java.util.Map;

public class Ch132 {

    public boolean isWritable(String letter, String magazine){
        Map<Character, Integer> letterMap = findLetterCount(letter);
        Map<Character, Integer> magazineMap = findLetterCount(magazine);

        for (Character chr : letterMap.keySet()){
            Integer letterCount = letterMap.get(chr);
            Integer magazineCount = magazineMap.get(chr);

            if (magazineCount == null){
                return false;
            }

            if (letterCount > magazineCount){
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> findLetterCount(String str){
        Map<Character, Integer> letterToCount = new HashMap<>();
        for (Character chr : str.toCharArray()){
            letterToCount.merge(chr, 1, Integer::sum);
        }

        return letterToCount;
    }
}
