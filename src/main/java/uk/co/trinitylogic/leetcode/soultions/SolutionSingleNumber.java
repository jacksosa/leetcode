package uk.co.trinitylogic.leetcode.soultions;

import java.util.HashMap;
import java.util.Map;

public class SolutionSingleNumber {

    // https://leetcode.com/problems/single-number/

    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }

    public int singleNumberMemo(int[] nums) {
        Map<Integer, Boolean> memo = new HashMap<>();
        for (int num : nums) {
            memo.put(num, !memo.getOrDefault(num, false));
        }
        for (Map.Entry<Integer, Boolean> entry : memo.entrySet()) {
            if (Boolean.TRUE.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return Integer.MIN_VALUE;
    }

    public int singleNumberBruteForce(int[] nums) {

        // brute force
        boolean isTwice;

        for (int i = 0; i < nums.length; i++) {

            int outer = nums[i];
            isTwice = false;

            for (int j = 0; j < nums.length; j++) {
                int inner = nums[j];
                if (i != j && inner == outer) {
                    isTwice = true;
                    break;
                }
            }
            if (!isTwice) return outer;
        }
        return nums[nums.length - 1];
    }
}
