package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionValidAnagram242Test {

    @Test
    void isAnagram_Example_1() {
        String input1 = "anagram";
        String input2 = "nagaram";
        boolean output = true;
        SolutionValidAnagram242 target = new SolutionValidAnagram242();
        boolean result = target.isAnagram(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isAnagram_Example_2() {
        String input1 = "rat";
        String input2 = "car";
        boolean output = false;
        SolutionValidAnagram242 target = new SolutionValidAnagram242();
        boolean result = target.isAnagram(input1, input2);
        assertEquals(output, result);
    }
}