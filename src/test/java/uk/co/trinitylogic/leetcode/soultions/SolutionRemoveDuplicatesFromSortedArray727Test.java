package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionRemoveDuplicatesFromSortedArray727Test {

    @Test
    void removeDuplicates_Example_1() {

        int[] input = new int[]{1, 1, 2};
        int[] output = new int[]{1, 2, -999};
        // Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
        // It does not matter what you leave beyond the returned k (hence they are underscores).
        SolutionRemoveDuplicatesFromSortedArray727 target = new SolutionRemoveDuplicatesFromSortedArray727();
        int result = target.removeDuplicates(input);

        assertEquals(2, result);
        for (int i = 0; i < result; i++) {
            assertEquals(output[i], input[i]);
        }
    }

    @Test
    void removeDuplicates_Example_2() {

        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] output = new int[]{0, 1, 2, 3, 4, -999, -999, -999, -999, -999};
        // Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
        // It does not matter what you leave beyond the returned k (hence they are underscores).
        SolutionRemoveDuplicatesFromSortedArray727 target = new SolutionRemoveDuplicatesFromSortedArray727();
        int result = target.removeDuplicates(input);

        assertEquals(5, result);
        for (int i = 0; i < result; i++) {
            assertEquals(output[i], input[i]);
        }
    }
}