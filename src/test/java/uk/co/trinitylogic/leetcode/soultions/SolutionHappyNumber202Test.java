package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionHappyNumber202Test {

    @Test
    void isHappy_Example_1() {
        int input = 19;
        boolean output = true;
        // Explanation:
        //        12 + 92 = 82
        //        82 + 22 = 68
        //        62 + 82 = 100
        //        12 + 02 + 02 = 1
        SolutionHappyNumber202 target = new SolutionHappyNumber202();
        boolean result = target.isHappy(input);
        assertEquals(output, result);
    }

    @Test
    void isHappy_Example_2() {
        int input = 2;
        boolean output = false;
        SolutionHappyNumber202 target = new SolutionHappyNumber202();
        boolean result = target.isHappy(input);
        assertEquals(output, result);
    }
}