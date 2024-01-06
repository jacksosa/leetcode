package uk.co.trinitylogic.leetcode.soultions;

import java.util.HashMap;
import java.util.Map;

public class SolutionWordPattern290 {

    // https://leetcode.com/problems/word-pattern/

    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> memo = new HashMap<>();

        char[] pc = pattern.toCharArray();
        String[] sc = s.split(" ");

        if (pc.length != sc.length) {
            return false;
        }

        for (int i = 0; i < pc.length; i++) {
            char pv = pc[i];
            String sv = sc[i];
            if (memo.containsKey(pv)) {
                if (!sv.equals(memo.get(pv))) {
                    return false;
                }
            } else {
                if (memo.containsValue(sv)) {
                    return false;
                }
                memo.put(pv, sv);
            }
        }
        return true;
    }
}
