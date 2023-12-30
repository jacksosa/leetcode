package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionIsSubsequence392Test {

    @Test
    void isSubsequence_Example_1() {
        String input1 = "abc";
        String input2 = "ahbgdc";
        boolean output = true;

        SolutionIsSubsequence392 target = new SolutionIsSubsequence392();
        boolean result = target.isSubsequence(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isSubsequence_Example_2() {
        String input1 = "axc";
        String input2 = "ahbgdc";
        boolean output = false;

        SolutionIsSubsequence392 target = new SolutionIsSubsequence392();
        boolean result = target.isSubsequence(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isSubsequence_Example_3() {
        String input1 = "acb";
        String input2 = "ahbgdc";
        boolean output = false;

        SolutionIsSubsequence392 target = new SolutionIsSubsequence392();
        boolean result = target.isSubsequence(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isSubsequence_Example_4() {
        String input1 = "bb";
        String input2 = "ahbgdc";
        boolean output = false;

        SolutionIsSubsequence392 target = new SolutionIsSubsequence392();
        boolean result = target.isSubsequence(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isSubsequence_Example_5() {
        String input1 = "ab";
        String input2 = "baab";
        boolean output = true;

        SolutionIsSubsequence392 target = new SolutionIsSubsequence392();
        boolean result = target.isSubsequence(input1, input2);
        assertEquals(output, result);
    }
}