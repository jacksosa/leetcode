package uk.co.trinitylogic.leetcode.soultions;

public class SolutionRemoveDuplicatesFromSortedArray727 {

    // https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

    public int removeDuplicates(int[] nums) {

        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }
        return ++k;
    }
}
