package uk.co.trinitylogic.leetcode.soultions;

public class SolutionSqrtOfX69 {

    // https://leetcode.com/problems/sqrtx/

    public int mySqrt(int x) {

        if (x <= 1) {
            return x;
        }

        int start = 1;
        int end = (x / 2) + 1;
        int sqrt = 0;
        long mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start = (int) mid + 1;
                sqrt = (int) mid;
            } else {
                end = (int) mid - 1;
            }
        }

        return sqrt;
    }
}
