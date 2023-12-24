package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionRomanToInteger13Test {

    @Test
    void romanToInt_Example_1() {
        String input = "III";
        int output = 3;
        // Explanation: III = 3.
        SolutionRomanToInteger13 target = new SolutionRomanToInteger13();
        int result = target.romanToInt(input);
        assertEquals(output, result);
    }

    @Test
    void romanToInt_Example_2() {
        String input = "LVIII";
        int output = 58;
        // Explanation: L = 50, V= 5, III = 3.
        SolutionRomanToInteger13 target = new SolutionRomanToInteger13();
        int result = target.romanToInt(input);
        assertEquals(output, result);
    }

    @Test
    void romanToInt_Example_3() {
        String input = "MCMXCIV";
        int output = 1994;
        // Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
        SolutionRomanToInteger13 target = new SolutionRomanToInteger13();
        int result = target.romanToInt(input);
        assertEquals(output, result);
    }
}