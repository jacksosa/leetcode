package uk.co.trinitylogic.leetcode.soultions;

public class SolutionRotateArray189 {

    // https://leetcode.com/problems/rotate-array/

    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int[] r = new int[l];
        if (k > l) {
            k = (k % l);
        }
        for (int i = 0; i < l; i++) {
            int v = nums[i];
            int o = i + k;
            if (o >= l) {
                o = o - l;
            }
            r[o] = v;
        }
        System.arraycopy(r, 0, nums, 0, l);
    }
}
