package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSqrtOfX69Test {

    @Test
    void mySqrt_Example_1() {
        int input = 4;
        int output = 2;
        // Explanation: The square root of 4 is 2, so we return 2.
        SolutionSqrtOfX69 target = new SolutionSqrtOfX69();
        int result = target.mySqrt(input);
        assertEquals(output, result);
    }

    @Test
    void mySqrt_Example_2() {
        int input = 8;
        int output = 2;
        // Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
        SolutionSqrtOfX69 target = new SolutionSqrtOfX69();
        int result = target.mySqrt(input);
        assertEquals(output, result);
    }
}