package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionNumberOf1Bits191Test {

    @Test
    void hammingWeight_Example_1() {
        int input = 11; // 00000000000000000000000000001011
        int output = 3;
        //Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
        SolutionNumberOf1Bits191 target = new SolutionNumberOf1Bits191();
        int result = target.hammingWeight(input);
        assertEquals(output, result);
    }

    @Test
    void hammingWeight_Example_2() {
        int input = 128; // 00000000000000000000000010000000
        int output = 1;
        SolutionNumberOf1Bits191 target = new SolutionNumberOf1Bits191();
        int result = target.hammingWeight(input);
        assertEquals(output, result);
    }

    @Test
    void hammingWeight_Example_3() {
        int input = -3; // 11111111111111111111111111111101
        int output = 31;
        SolutionNumberOf1Bits191 target = new SolutionNumberOf1Bits191();
        int result = target.hammingWeight(input);
        assertEquals(output, result);
    }
}