package prog.interview.ch17;

import java.util.*;

public class Ch171 {
    public int findScoreCombinationsCount(int finalScore, List<Integer> availablePoints){
        int combinationsCount = 0;
        int minPoint = Collections.min(availablePoints);

        List<Integer> leftoverScores = new ArrayList<>();
        leftoverScores.add(finalScore);

        while (!leftoverScores.isEmpty()) {
            List<Integer> leftoverScoresToAdd = new ArrayList<>();
            for (int leftoverScore : leftoverScores) {
                for (int point : availablePoints) {
                    int newLeftoverScore = leftoverScore - point;
                    if (newLeftoverScore == 0) {
                        combinationsCount++;
                    }
                    if (newLeftoverScore >= minPoint){
                        leftoverScoresToAdd.add(newLeftoverScore);
                    }
                }
            }
            leftoverScores.clear();
            leftoverScores.addAll(leftoverScoresToAdd);
        }

        return combinationsCount;
    }
}
