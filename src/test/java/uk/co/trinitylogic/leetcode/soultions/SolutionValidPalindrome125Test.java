package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionValidPalindrome125Test {

    @Test
    void isPalindrome_Example_1() {
        String input = "A man, a plan, a canal: Panama";
        boolean output = true;
        // Explanation: "amanaplanacanalpanama" is a palindrome.
        SolutionValidPalindrome125 target = new SolutionValidPalindrome125();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }

    @Test
    void isPalindrome_Example_2() {
        String input = "race a car";
        boolean output = false;
        // Explanation: "raceacar" is not a palindrome.
        SolutionValidPalindrome125 target = new SolutionValidPalindrome125();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }

    @Test
    void isPalindrome_Example_3() {
        String input = " ";
        boolean output = true;
        // Explanation: s is an empty string "" after removing non-alphanumeric characters.
        // Since an empty string reads the same forward and backward, it is a palindrome.
        SolutionValidPalindrome125 target = new SolutionValidPalindrome125();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }

    @Test
    void isPalindrome_Example_4() {
        String input = "0P";
        boolean output = false;
        SolutionValidPalindrome125 target = new SolutionValidPalindrome125();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }
}