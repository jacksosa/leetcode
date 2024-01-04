package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionPowerOfTwo231Test {

    @Test
    void isPowerOfTwo_Example_1() {
        int input = 1;
        boolean output = true;
        // Explanation: 20 = 1
        SolutionPowerOfTwo231 target = new SolutionPowerOfTwo231();
        boolean result = target.isPowerOfTwo(input);
        assertEquals(output, result);
    }

    @Test
    void isPowerOfTwo_Example_2() {
        int input = 16;
        boolean output = true;
        // Explanation: 2^4 = 16
        SolutionPowerOfTwo231 target = new SolutionPowerOfTwo231();
        boolean result = target.isPowerOfTwo(input);
        assertEquals(output, result);
    }

    @Test
    void isPowerOfTwo_Example_3() {
        int input = 3;
        boolean output = false;
        SolutionPowerOfTwo231 target = new SolutionPowerOfTwo231();
        boolean result = target.isPowerOfTwo(input);
        assertEquals(output, result);
    }

    @Test
    void isPowerOfTwo_Example_4() {
        int input = 8;
        boolean output = true;
        SolutionPowerOfTwo231 target = new SolutionPowerOfTwo231();
        boolean result = target.isPowerOfTwo(input);
        assertEquals(output, result);
    }

    @Test
    void isPowerOfTwo_Example_5() {
        int input = 2147483647;
        boolean output = false;
        SolutionPowerOfTwo231 target = new SolutionPowerOfTwo231();
        boolean result = target.isPowerOfTwo(input);
        assertEquals(output, result);
    }
}