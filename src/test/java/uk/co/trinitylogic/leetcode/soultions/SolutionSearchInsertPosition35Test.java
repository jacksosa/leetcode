package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSearchInsertPosition35Test {

    @Test
    void searchInsert_Example_1() {
        int[] input1 = new int[]{1, 3, 5, 6};
        int input2 = 5;
        int output = 2;
        SolutionSearchInsertPosition35 target = new SolutionSearchInsertPosition35();
        int result = target.searchInsert(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void searchInsert_Example_2() {
        int[] input1 = new int[]{1, 3, 5, 6};
        int input2 = 2;
        int output = 1;
        SolutionSearchInsertPosition35 target = new SolutionSearchInsertPosition35();
        int result = target.searchInsert(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void searchInsert_Example_3() {
        int[] input1 = new int[]{1, 3, 5, 6};
        int input2 = 7;
        int output = 4;
        SolutionSearchInsertPosition35 target = new SolutionSearchInsertPosition35();
        int result = target.searchInsert(input1, input2);
        assertEquals(output, result);
    }
}