package uk.co.trinitylogic.leetcode.soultions;

import java.util.*;

public class SolutionContainsDuplicateII219 {

    // https://leetcode.com/problems/contains-duplicate-ii/

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> memo = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                memo.remove(nums[i - k - 1]);
            }
            if (!memo.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {

        Map<Integer, List<Integer>> memo = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (memo.containsKey(num)) {
                List<Integer> indexes = memo.get(num);
                indexes.add(i);
            } else {
                List<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                memo.put(num, indexes);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (memo.containsKey(num)) {
                List<Integer> indexes = memo.get(num);
                for (int j : indexes) {
                    if (i != j && (Math.abs(i - j) <= k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
