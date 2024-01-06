package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionWordPattern290Test {

    @Test
    void wordPattern_Example_1() {
        String input1 = "abba";
        String input2 = "dog cat cat dog";
        boolean output = true;
        SolutionWordPattern290 target = new SolutionWordPattern290();
        boolean result = target.wordPattern(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void wordPattern_Example_2() {
        String input1 = "abba";
        String input2 = "dog cat cat fish";
        boolean output = false;
        SolutionWordPattern290 target = new SolutionWordPattern290();
        boolean result = target.wordPattern(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void wordPattern_Example_3() {
        String input1 = "aaaa";
        String input2 = "dog cat cat dog";
        boolean output = false;
        SolutionWordPattern290 target = new SolutionWordPattern290();
        boolean result = target.wordPattern(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void wordPattern_Example_4() {
        String input1 = "abba";
        String input2 = "dog dog dog dog";
        boolean output = false;
        SolutionWordPattern290 target = new SolutionWordPattern290();
        boolean result = target.wordPattern(input1, input2);
        assertEquals(output, result);
    }
}