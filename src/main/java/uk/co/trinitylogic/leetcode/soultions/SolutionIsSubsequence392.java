package uk.co.trinitylogic.leetcode.soultions;

public class SolutionIsSubsequence392 {

    // https://leetcode.com/problems/is-subsequence/

    public boolean isSubsequence(String s, String t) {
        char[] scs = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int offset = 0;

        for (char cs : scs) {
            char[] tcs = t.toCharArray();
            for (int j = offset; j < tcs.length; j++) {
                char tc = tcs[j];
                if (cs == tc) {
                    result.append(tc);
                    offset = j + 1;
                    for (int i = offset; i < tcs.length; i++) {
                        if (cs == tcs[i]) {
                            tcs[i] = '@';
                        }
                    }
                }
            }
        }
        return s.contentEquals(result);
    }
}
