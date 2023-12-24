package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionValidParentheses20Test {

    @Test
    void isValid_Example_1() {
        String input = "()";
        boolean output = true;
        SolutionValidParentheses20 target = new SolutionValidParentheses20();
        boolean result = target.isValid(input);
        assertEquals(output, result);
    }

    @Test
    void isValid_Example_2() {
        String input = "()[]{}";
        boolean output = true;
        SolutionValidParentheses20 target = new SolutionValidParentheses20();
        boolean result = target.isValid(input);
        assertEquals(output, result);
    }

    @Test
    void isValid_Example_3() {
        String input = "(]";
        boolean output = false;
        SolutionValidParentheses20 target = new SolutionValidParentheses20();
        boolean result = target.isValid(input);
        assertEquals(output, result);
    }

    @Test
    void isValid_Example_4() {
        String input = "{[]}";
        boolean output = true;
        SolutionValidParentheses20 target = new SolutionValidParentheses20();
        boolean result = target.isValid(input);
        assertEquals(output, result);
    }

}