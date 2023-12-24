package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionLengthOfLastWord58Test {

    @Test
    void lengthOfLastWord_Example_1() {
        String input = "Hello World";
        int output = 5;
        // Explanation: The last word is "World" with length 5.
        SolutionLengthOfLastWord58 target = new SolutionLengthOfLastWord58();
        int result = target.lengthOfLastWord(input);
        assertEquals(output, result);
    }

    @Test
    void lengthOfLastWord_Example_2() {
        String input = "   fly me   to   the moon  ";
        int output = 4;
        // Explanation: The last word is "moon" with length 4.
        SolutionLengthOfLastWord58 target = new SolutionLengthOfLastWord58();
        int result = target.lengthOfLastWord(input);
        assertEquals(output, result);
    }

    @Test
    void lengthOfLastWord_Example_3() {
        String input = "luffy is still joyboy";
        int output = 6;
        // Explanation: The last word is "joyboy" with length 6.
        SolutionLengthOfLastWord58 target = new SolutionLengthOfLastWord58();
        int result = target.lengthOfLastWord(input);
        assertEquals(output, result);
    }
}