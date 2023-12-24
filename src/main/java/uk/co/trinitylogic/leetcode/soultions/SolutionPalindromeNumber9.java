package uk.co.trinitylogic.leetcode.soultions;

public class SolutionPalindromeNumber9 {

    // https://leetcode.com/problems/palindrome-number/

    public boolean isPalindrome(int x) {

        char[] values = Integer.toString(x).toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char value : values) {
            sb.append(value);
        }

        String forward = sb.toString();
        String reverse = sb.reverse().toString();

        return forward.equals(reverse);
    }
}
