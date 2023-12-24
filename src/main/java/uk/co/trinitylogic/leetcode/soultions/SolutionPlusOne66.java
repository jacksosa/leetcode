package uk.co.trinitylogic.leetcode.soultions;

public class SolutionPlusOne66 {

    // https://leetcode.com/problems/plus-one/

    // if the last number is less then nine we can just increment this and return,
    // otherwise its a rollover to the array grows by one and contains 1 and the rest zeros
    // ie. [9,9,9,9,9] + 1 = [1,0,0,0,0,0] - ints have a default value of 0 so we only have to set the value at index 0

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
