package uk.co.trinitylogic.leetcode.soultions;

public class SolutionHappyNumber202 {

    // https://leetcode.com/problems/happy-number/

    public boolean isHappy(int n) {
        int count = 0;

        while (n != 1) {
            int sub = 0;
            for (int c : Integer.toString(n).toCharArray()) {
                sub = sub + (int) Math.pow(Character.getNumericValue(c), 2);
            }
            n = sub;
            count++;
            if (count > 10) {
                return false;
            }
        }

        return true;
    }
}
