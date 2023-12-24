package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTwoSum1Test {

    @Test
    void twoSum_Example_1() {
        int[] input1 = new int[]{2, 7, 11, 15};
        int input2 = 9;
        int[] output = new int[]{0, 1};
        // Because nums[0] + nums[1] == 9, we return [0, 1].
        SolutionTwoSum1 target = new SolutionTwoSum1();
        int[] result = target.twoSum(input1, input2);
        assertArrayEquals(output, result);
    }

    @Test
    void twoSum_Example_2() {
        int[] input1 = new int[]{3, 2, 4};
        int input2 = 6;
        int[] output = new int[]{1, 2};
        SolutionTwoSum1 target = new SolutionTwoSum1();
        int[] result = target.twoSum(input1, input2);
        assertArrayEquals(output, result);
    }

    @Test
    void twoSum_Example_3() {
        int[] input1 = new int[]{3, 3};
        int input2 = 6;
        int[] output = new int[]{0, 1};
        SolutionTwoSum1 target = new SolutionTwoSum1();
        int[] result = target.twoSum(input1, input2);
        assertArrayEquals(output, result);
    }

}