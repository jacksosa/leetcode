package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionNthTribonacciNumber1137Test {

    @Test
    void tribonacci_Example_1() {
        int input = 4;
        int output = 4;
        // Explanation:
        //      T_3 = 0 + 1 + 1 = 2
        //      T_4 = 1 + 1 + 2 = 4
        SolutionNthTribonacciNumber1137 target = new SolutionNthTribonacciNumber1137();
        int result = target.tribonacci(input);
        assertEquals(output, result);
    }

    @Test
    void tribonacci_Example_2() {
        int input = 25;
        int output = 1389537;
        SolutionNthTribonacciNumber1137 target = new SolutionNthTribonacciNumber1137();
        int result = target.tribonacci(input);
        assertEquals(output, result);
    }
}