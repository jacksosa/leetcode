package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionPlusOne66Test {

    @Test
    void plusOne_Example_1() {
        int[] input = new int[]{1, 2, 3};
        int[] output = new int[]{1, 2, 4};
        // Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4].
        SolutionPlusOne66 target = new SolutionPlusOne66();
        int[] result = target.plusOne(input);
        assertArrayEquals(output, result);
    }

    @Test
    void plusOne_Example_2() {
        int[] input = new int[]{4, 3, 2, 1};
        int[] output = new int[]{4, 3, 2, 2};
        // Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the result should be [4,3,2,2].
        SolutionPlusOne66 target = new SolutionPlusOne66();
        int[] result = target.plusOne(input);
        assertArrayEquals(output, result);
    }

    @Test
    void plusOne_Example_3() {
        int[] input = new int[]{9};
        int[] output = new int[]{1, 0};
        // Explanation: The array represents the integer 9. Incrementing by one gives 9 + 1 = 10. Thus, the result should be [1,0].
        SolutionPlusOne66 target = new SolutionPlusOne66();
        int[] result = target.plusOne(input);
        assertArrayEquals(output, result);
    }

    @Test
    void plusOne_Example_4() {
        int[] input = new int[]{9,8,7,6,5,4,3,2,1,0};
        int[] output = new int[]{9,8,7,6,5,4,3,2,1,1};
        SolutionPlusOne66 target = new SolutionPlusOne66();
        int[] result = target.plusOne(input);
        assertArrayEquals(output, result);
    }

    @Test
    void plusOne_Example_5() {
        int[] input = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] output = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7};
        SolutionPlusOne66 target = new SolutionPlusOne66();
        int[] result = target.plusOne(input);
        assertArrayEquals(output, result);
    }
}