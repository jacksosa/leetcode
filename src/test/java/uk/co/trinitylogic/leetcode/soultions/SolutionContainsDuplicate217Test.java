package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionContainsDuplicate217Test {

    @Test
    void containsDuplicate_Example_1() {
        int[] input = new int[]{1, 2, 3, 1};
        boolean output = true;
        SolutionContainsDuplicate217 target = new SolutionContainsDuplicate217();
        boolean result = target.containsDuplicate(input);
        assertEquals(output, result);
    }

    @Test
    void containsDuplicate_Example_2() {
        int[] input = new int[]{1, 2, 3, 4};
        boolean output = false;
        SolutionContainsDuplicate217 target = new SolutionContainsDuplicate217();
        boolean result = target.containsDuplicate(input);
        assertEquals(output, result);
    }

    @Test
    void containsDuplicate_Example_3() {
        int[] input = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean output = true;
        SolutionContainsDuplicate217 target = new SolutionContainsDuplicate217();
        boolean result = target.containsDuplicate(input);
        assertEquals(output, result);
    }
}