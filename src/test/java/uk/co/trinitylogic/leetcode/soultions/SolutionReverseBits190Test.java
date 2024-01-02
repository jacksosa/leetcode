package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionReverseBits190Test {

    @Test
    void reverseBits_Example_1() {
        int input = 43261596; // (00000010100101000001111010011100);
        int output = 964176192; // (00111001011110000010100101000000)
        // Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
        SolutionReverseBits190 target = new SolutionReverseBits190();
        int result = target.reverseBits(input);
        assertEquals(output, result);
    }

    @Test
    void reverseBits_Example_2() {
        long input = 4294967293L; // (11111111111111111111111111111101);
        long output = 3221225470L; // (10111111111111111111111111111111)
        // Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.
        SolutionReverseBits190 target = new SolutionReverseBits190();
        long result = target.reverseBits(input);
        assertEquals(output, result);
    }
}