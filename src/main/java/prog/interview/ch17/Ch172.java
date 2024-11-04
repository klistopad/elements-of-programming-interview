package prog.interview.ch17;

public class Ch172 {
    public int findWordDistance(String word1, String word2) {
        String word = word1.length() > word2.length() ? word1 : word2;
        String subWord = word1.length() < word2.length() ? word1 : word2;

        int maxOverlaps = 0;

        for (int sw1 = 0; sw1 < subWord.length(); sw1++) {
            int wordStartIndex = 0;
            int overlaps = 0;
            for (int sw2 = sw1; sw2 < subWord.length(); sw2++) {
                for (int w = wordStartIndex; w < word.length(); w++) {
                    if (word.charAt(w) == subWord.charAt(sw2)) {
                        overlaps++;
                        wordStartIndex = w + 1;
                        break;
                    }
                }
            }
            if (overlaps > maxOverlaps) {
                maxOverlaps = overlaps;
            }
        }


        return (word.length() - maxOverlaps) + (subWord.length() - maxOverlaps);
    }
}
