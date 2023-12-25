package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionClimbingStairs70Test {

    @Test
    void climbStairs_Example_1() {
        int input = 2;
        int output = 2;
        // Explanation: There are two ways to climb to the top.
        // 1. 1 step + 1 step
        // 2. 2 steps
        SolutionClimbingStairs70 target = new SolutionClimbingStairs70();
        int result = target.climbStairs(input);
        assertEquals(output, result);
    }

    @Test
    void climbStairs_Example_2() {
        int input = 3;
        int output = 3;
        // Explanation: There are three ways to climb to the top.
        // 1. 1 step + 1 step + 1 step
        // 2. 1 step + 2 steps
        // 3. 2 steps + 1 step
        SolutionClimbingStairs70 target = new SolutionClimbingStairs70();
        int result = target.climbStairs(input);
        assertEquals(output, result);
    }

    @Test
    void climbStairs_Example_3() {
        int input = 4;
        int output = 5;
        // Explanation: There are 5 ways to climb to the top.
        // 1. 1 step + 1 step + 1 step + 1 step
        // 2. 1 step + 1 step + 2 steps
        // 3. 2 steps + 1 step + 1 step
        // 4. 1 step + 2 steps + 1 step
        // 5. 2 steps + 2 steps
        SolutionClimbingStairs70 target = new SolutionClimbingStairs70();
        int result = target.climbStairs(input);
        assertEquals(output, result);
    }

    @Test
    void climbStairs2_Example_1() {
        int input = 2;
        int output = 2;
        // Explanation: There are two ways to climb to the top.
        // 1. 1 step + 1 step
        // 2. 2 steps
        SolutionClimbingStairs70 target = new SolutionClimbingStairs70();
        int result = target.climbStairs2(input);
        assertEquals(output, result);
    }

    @Test
    void climbStairs2_Example_2() {
        int input = 3;
        int output = 3;
        // Explanation: There are three ways to climb to the top.
        // 1. 1 step + 1 step + 1 step
        // 2. 1 step + 2 steps
        // 3. 2 steps + 1 step
        SolutionClimbingStairs70 target = new SolutionClimbingStairs70();
        int result = target.climbStairs2(input);
        assertEquals(output, result);
    }

    @Test
    void climbStairs2_Example_3() {
        int input = 4;
        int output = 5;
        // Explanation: There are 5 ways to climb to the top.
        // 1. 1 step + 1 step + 1 step + 1 step
        // 2. 1 step + 1 step + 2 steps
        // 3. 2 steps + 1 step + 1 step
        // 4. 1 step + 2 steps + 1 step
        // 5. 2 steps + 2 steps
        SolutionClimbingStairs70 target = new SolutionClimbingStairs70();
        int result = target.climbStairs2(input);
        assertEquals(output, result);
    }
}