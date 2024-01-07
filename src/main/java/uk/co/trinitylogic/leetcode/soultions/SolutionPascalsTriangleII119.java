package uk.co.trinitylogic.leetcode.soultions;

import java.util.ArrayList;
import java.util.List;

public class SolutionPascalsTriangleII119 {

    // https://leetcode.com/problems/pascals-triangle-ii/

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = generate(rowIndex + 1);
        return result.get(rowIndex);
    }

    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> previous = null;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> level = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (i <= 2) {
                    level.add(1);
                } else if (j == 1) {
                    level.add(previous.getFirst());
                } else if (j == i) {
                    level.add(previous.getLast());
                } else {
                    int p1 = previous.get(j - 2);
                    int p2 = previous.get(j - 1);
                    level.add(p1 + p2);
                }
            }
            previous = level;
            result.add(level);
        }
        return result;
    }
}
