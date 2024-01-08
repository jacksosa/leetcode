package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionRotateArray189Test {

    @Test
    void rotate_Example_1() {
        int[] input1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int input2 = 3;
        int[] output = new int[]{5, 6, 7, 1, 2, 3, 4};
        //        Explanation:
        //        rotate 1 steps to the right: [7, 1, 2, 3, 4, 5, 6]
        //        rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5]
        //        rotate 3 steps to the right: [5, 6, 7, 1, 2, 3, 4]
        SolutionRotateArray189 target = new SolutionRotateArray189();
        target.rotate(input1, input2);
        assertArrayEquals(output, input1);
    }

    @Test
    void rotate_Example_2() {
        int[] input1 = new int[]{-1, -100, 3, 99};
        int input2 = 2;
        int[] output = new int[]{3, 99, -1, -100};
        //        Explanation:
        //        rotate 1 steps to the right: [99,-1,-100,3]
        //        rotate 2 steps to the right: [3,99,-1,-100]
        SolutionRotateArray189 target = new SolutionRotateArray189();
        target.rotate(input1, input2);
        assertArrayEquals(output, input1);
    }

    @Test
    void rotate_Example_3() {
        int[] input1 = new int[]{-1};
        int input2 = 2;
        int[] output = new int[]{-1};
        SolutionRotateArray189 target = new SolutionRotateArray189();
        target.rotate(input1, input2);
        assertArrayEquals(output, input1);
    }

    @Test
    void rotate_Example_4() {
        int[] input1 = new int[]{1, 2};
        int input2 = 3;
        int[] output = new int[]{2, 1};
        SolutionRotateArray189 target = new SolutionRotateArray189();
        target.rotate(input1, input2);
        assertArrayEquals(output, input1);
    }

    @Test
    void rotate_Example_5() {
        int[] input1 = new int[]{1, 2, 3};
        int input2 = 4;
        int[] output = new int[]{3, 1, 2};
        SolutionRotateArray189 target = new SolutionRotateArray189();
        target.rotate(input1, input2);
        assertArrayEquals(output, input1);
    }
}