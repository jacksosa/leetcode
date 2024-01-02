package uk.co.trinitylogic.leetcode.soultions;

public class SolutionHappyNumber202 {

    // https://leetcode.com/problems/happy-number/

    public boolean isHappy(int n) {

        String s = Integer.toString(n);
        int result = 0;
        int count = 0;

        while (result != 1) {
            int total = 0;
            for (int c : s.toCharArray()) {
                total = total + (int) Math.pow(Character.getNumericValue(c), 2);
            }
            s = Integer.toString(total);
            result = total;
            count++;
            if (count > 10) {
                return false;
            }
        }

        return true;
    }
}
