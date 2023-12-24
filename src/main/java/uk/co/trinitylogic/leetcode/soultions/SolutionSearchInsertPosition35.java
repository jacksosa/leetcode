package uk.co.trinitylogic.leetcode.soultions;

public class SolutionSearchInsertPosition35 {

    // https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {

        int index = 0;
        for (int i : nums) {
            if (i == target || target < i) {
                break;
            }
            index++;
        }

        return index;
    }
}
