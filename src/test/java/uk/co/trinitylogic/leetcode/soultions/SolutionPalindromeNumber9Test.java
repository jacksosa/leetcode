package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionPalindromeNumber9Test {

    @Test
    void isPalindrome_Example_1() {
        int input = 121;
        boolean output = true;
        // Explanation: 121 reads as 121 from left to right and from right to left.
        SolutionPalindromeNumber9 target = new SolutionPalindromeNumber9();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }

    @Test
    void isPalindrome_Example_2() {
        int input = -121;
        boolean output = false;
        // Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        SolutionPalindromeNumber9 target = new SolutionPalindromeNumber9();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }

    @Test
    void isPalindrome_Example_3() {
        int input = 10;
        boolean output = false;
        // Reads 01 from right to left. Therefore it is not a palindrome.
        SolutionPalindromeNumber9 target = new SolutionPalindromeNumber9();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }
}