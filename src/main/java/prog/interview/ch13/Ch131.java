package prog.interview.ch13;

import java.util.HashMap;
import java.util.Map;

public class Ch131 {

    public boolean checkPalindrome(String str){
        Map<Character, Integer> charToCount = new HashMap<>();

        for (Character chr : str.toCharArray()){
            charToCount.merge(chr, 1, Integer::sum);
        }

        long oddCount = charToCount.values()
                .stream()
                .filter(val -> val % 2 == 1)
                .count();

        return oddCount < 2;
    }
}
