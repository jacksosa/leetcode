package uk.co.trinitylogic.leetcode.soultions;

public class SolutionNumberOf1Bits191 {

    // https://leetcode.com/problems/number-of-1-bits/

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        int count = 0;
        for (char b : bin.toCharArray()) {
            if ('1' == b) {
                count++;
            }
        }
        return count;
    }
}
