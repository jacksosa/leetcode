package uk.co.trinitylogic.leetcode.soultions;

public class SolutionReverseBits190 {

    private static long getTotal(int[] result) {
        long total = 0;
        for (int i = 0; i < 32; i++) {
            int x = result[i];
            int p = 32 - i - 1;
            int pow = (int) (Math.pow(2, p));
            total = total + ((long) pow * x);
        }
        return total;
    }

    private static int[] getInts(String s) {
        // pad if not 32 chars
        StringBuilder pad = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            if (32 - (i + s.length()) > 0) {
                pad.append("0");
            }
        }
        s = pad + s;
        int left = 0;
        int right = s.length() - 1;
        int[] result = new int[32];
        while (left <= right) {
            result[left] = s.charAt(right) == '1' ? 1 : 0;
            result[right] = s.charAt(left) == '1' ? 1 : 0;
            left++;
            right--;
        }
        return result;
    }

    // https://leetcode.com/problems/reverse-bits/
    public long reverseBits(long n) {
        String s = Long.toBinaryString(n);
        int[] result = getInts(s);
        return getTotal(result);
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        int[] result = getInts(s);
        return (int) getTotal(result);
    }
}
