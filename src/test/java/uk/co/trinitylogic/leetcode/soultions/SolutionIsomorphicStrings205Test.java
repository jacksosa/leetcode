package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionIsomorphicStrings205Test {

    @Test
    void isIsomorphic_Example_1() {
        String input1 = "egg";
        String input2 = "add";
        boolean output = true;

        SolutionIsomorphicStrings205 target = new SolutionIsomorphicStrings205();
        boolean result = target.isIsomorphic(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isIsomorphic_Example_2() {
        String input1 = "foo";
        String input2 = "bar";
        boolean output = false;

        SolutionIsomorphicStrings205 target = new SolutionIsomorphicStrings205();
        boolean result = target.isIsomorphic(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isIsomorphic_Example_3() {
        String input1 = "paper";
        String input2 = "title";
        boolean output = true;

        SolutionIsomorphicStrings205 target = new SolutionIsomorphicStrings205();
        boolean result = target.isIsomorphic(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isIsomorphic_Example_4() {
        String input1 = "badc";
        String input2 = "baba";
        boolean output = false;

        SolutionIsomorphicStrings205 target = new SolutionIsomorphicStrings205();
        boolean result = target.isIsomorphic(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isIsomorphic_Example_5() {
        String input1 = "aaeaa";
        String input2 = "uuxyy";
        boolean output = false;

        SolutionIsomorphicStrings205 target = new SolutionIsomorphicStrings205();
        boolean result = target.isIsomorphic(input1, input2);
        assertEquals(output, result);
    }
}