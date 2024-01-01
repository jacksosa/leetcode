package uk.co.trinitylogic.leetcode.soultions;

import java.util.HashSet;
import java.util.Set;

public class SolutionContainsDuplicate217 {

    // https://leetcode.com/problems/contains-duplicate/

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> memo = new HashSet<>();
        for (int num : nums) {
            if (memo.contains(num)) {
                return true;
            }
            memo.add(num);
        }
        return false;
    }
}
