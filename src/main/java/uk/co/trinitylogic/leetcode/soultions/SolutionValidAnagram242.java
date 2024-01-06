package uk.co.trinitylogic.leetcode.soultions;

import java.util.Arrays;

public class SolutionValidAnagram242 {

    // https://leetcode.com/problems/valid-anagram/

    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        Arrays.sort(sc);
        char[] tc = t.toCharArray();
        Arrays.sort(tc);
        return Arrays.equals(sc, tc);
    }
}
