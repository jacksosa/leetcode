package uk.co.trinitylogic.leetcode.soultions;

import java.util.HashMap;
import java.util.Map;

public class SolutionIsomorphicStrings205 {

    // https://leetcode.com/problems/isomorphic-strings/

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> memo = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (memo.containsKey(sc)) {
                if (memo.get(sc) != tc) {
                    return false;
                }
            } else {
                if (memo.containsValue(tc)) {
                    return false;
                }
                memo.put(sc, tc);
            }
        }
        return true;
    }
}
