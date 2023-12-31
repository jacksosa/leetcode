package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionRansomNote383Test {

    @Test
    void canConstruct_Example_1() {
        String input1 = "a";
        String input2 = "b";
        boolean output = false;

        SolutionRansomNote383 target = new SolutionRansomNote383();
        boolean result = target.canConstruct(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void canConstruct_Example_2() {
        String input1 = "aa";
        String input2 = "ab";
        boolean output = false;

        SolutionRansomNote383 target = new SolutionRansomNote383();
        boolean result = target.canConstruct(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void canConstruct_Example_3() {
        String input1 = "aa";
        String input2 = "aab";
        boolean output = true;

        SolutionRansomNote383 target = new SolutionRansomNote383();
        boolean result = target.canConstruct(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void canConstruct_Example_4() {
        String input1 = "a";
        String input2 = "b";
        boolean output = false;

        SolutionRansomNote383 target = new SolutionRansomNote383();
        boolean result = target.canConstruct(input1, input2);
        assertEquals(output, result);
    }
}