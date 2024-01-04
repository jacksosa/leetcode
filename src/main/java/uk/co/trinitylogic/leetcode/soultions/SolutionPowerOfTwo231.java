package uk.co.trinitylogic.leetcode.soultions;

public class SolutionPowerOfTwo231 {

    // https://leetcode.com/problems/power-of-two/

    public boolean isPowerOfTwo(int n) {
        double result = 0;
        int count = 0;
        while (result < n) {
            result = Math.pow(2, count);
            if (result == n) {
                return true;
            }
            count++;
        }
        return false;
    }
}
