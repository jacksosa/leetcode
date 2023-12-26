package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSingleNumberTest {

    @Test
    void singleNumber_Example_1() {
        int[] input = new int[]{2, 2, 1};
        int output = 1;
        SolutionSingleNumber target = new SolutionSingleNumber();
        int result = target.singleNumber(input);
        assertEquals(output, result);
    }

    @Test
    void singleNumber_Example_2() {
        int[] input = new int[]{4, 1, 2, 1, 2};
        int output = 4;
        SolutionSingleNumber target = new SolutionSingleNumber();
        int result = target.singleNumber(input);
        assertEquals(output, result);
    }

    @Test
    void singleNumber_Example_3() {
        int[] input = new int[]{1};
        int output = 1;
        SolutionSingleNumber target = new SolutionSingleNumber();
        int result = target.singleNumber(input);
        assertEquals(output, result);
    }
}