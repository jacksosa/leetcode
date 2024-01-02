package uk.co.trinitylogic.leetcode.soultions;

public class SolutionExcelSheetColumnTitle168 {

    // https://leetcode.com/problems/excel-sheet-column-title/
    private static final char[] ALPHABET = new char[]{
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            int v = (columnNumber - 1) % 26;
            result.append(ALPHABET[v]);
            columnNumber = (columnNumber - 1) / 26;
        }
        return result.reverse().toString();
    }

    public String convertToTitle2(int columnNumber) {

        StringBuilder result = new StringBuilder();
        int loops = 0;
        int count = 0;
        for (int i = 0; i < columnNumber; i++) {
            if (i != 0 && i % 26 == 0) {
                loops++;
                count = 0;
            }
            count++;
        }
        if (loops > 0) {
            result.append(ALPHABET[loops - 1]);
            result.append(ALPHABET[count - 1]);
        } else {
            result.append(ALPHABET[columnNumber - 1]);
        }
        return result.toString();
    }
}
