package uk.co.trinitylogic.leetcode.soultions;

public class SolutionValidPalindrome125 {

    // https://leetcode.com/problems/valid-palindrome/

    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().strip();
        StringBuilder r = new StringBuilder();
        for (int i = c.length() - 1; i >= 0; i--) {
            char val = c.charAt(i);
            r.append(val);
        }
        return c.contentEquals(r);
    }
}
