package uk.co.trinitylogic.leetcode.soultions;

public class SolutionPlusOne66 {

    // https://leetcode.com/problems/plus-one/

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i];
            if (val < 9) {
                digits[i] = val + 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
