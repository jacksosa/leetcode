package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionAddBinary67Test {

    @Test
    void addBinary_Example_1() {
        String input1 = "11";
        String input2 = "1";
        String output = "100";
        SolutionAddBinary67 target = new SolutionAddBinary67();
        String result = target.addBinary(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void addBinary_Example_2() {
        String input1 = "1010";
        String input2 = "1011";
        String output = "10101";
        SolutionAddBinary67 target = new SolutionAddBinary67();
        String result = target.addBinary(input1, input2);
        assertEquals(output, result);
    }
}