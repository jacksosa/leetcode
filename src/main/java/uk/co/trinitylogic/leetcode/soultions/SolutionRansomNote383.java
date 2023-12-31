package uk.co.trinitylogic.leetcode.soultions;

import java.util.HashMap;
import java.util.Map;

public class SolutionRansomNote383 {

    // https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[128];
        for (char ch : magazine.toCharArray()) {
            ++counter[ch];
        }
        for (char ch : ransomNote.toCharArray()) {
            if (--counter[ch] < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        Map<Character, Integer> memo = new HashMap<>();

        for (char mag : magazine.toCharArray()) {
            Integer count = memo.getOrDefault(mag, 0);
            memo.put(mag, ++count);
        }

        for (char ran : ransomNote.toCharArray()) {
            if (memo.containsKey(ran)) {
                Integer count = memo.get(ran);
                if (count > 0) {
                    memo.put(ran, --count);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
