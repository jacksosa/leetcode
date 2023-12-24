package uk.co.trinitylogic.leetcode.soultions;

public class SolutionLengthOfLastWord58 {

    // https://leetcode.com/problems/length-of-last-word/
    public int lengthOfLastWord(String s) {
        String[] values = s.split(" ");
        String last = values[values.length - 1];
        return last.length();
    }
}
