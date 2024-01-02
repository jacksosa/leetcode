package uk.co.trinitylogic.leetcode.soultions;

import java.util.ArrayList;
import java.util.List;

public class SolutionExcelSheetColumnNumber171 {

    // https://leetcode.com/problems/excel-sheet-column-number/

    private static final char[] ALPHABET = new char[]{
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    public int titleToNumber(String columnTitle) {
        char[] values = columnTitle.toCharArray();
        List<Integer> positions = new ArrayList<>();
        for (char value : values) {
            int position = getPosition(value);
            positions.add(position);
        }
        int total = 0;
        int count = 1;
        for (int position : positions) {
            total = total + (int) (Math.pow(26, (positions.size() - count))) * position;
            count++;
        }
        return total;
    }

    private int getPosition(char position) {
        for (int i = 1; i <= ALPHABET.length; i++) {
            if (position == ALPHABET[i - 1]) {
                return i;
            }
        }
        return -1;
    }
}
