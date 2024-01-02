package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionExcelSheetColumnNumber171Test {

    @Test
    void titleToNumber_Example_1() {
        String input = "A";
        int output = 1;
        SolutionExcelSheetColumnNumber171 target = new SolutionExcelSheetColumnNumber171();
        int result = target.titleToNumber(input);
        assertEquals(output, result);
    }

    @Test
    void titleToNumber_Example_2() {
        String input = "AB";
        int output = 28;
        SolutionExcelSheetColumnNumber171 target = new SolutionExcelSheetColumnNumber171();
        int result = target.titleToNumber(input);
        assertEquals(output, result);
    }

    @Test
    void titleToNumber_Example_3() {
        String input = "ZY";
        int output = 701;
        SolutionExcelSheetColumnNumber171 target = new SolutionExcelSheetColumnNumber171();
        int result = target.titleToNumber(input);
        assertEquals(output, result);
    }

    @Test
    void titleToNumber_Example_4() {
        String input = "FXSHRXW";
        int output = 2147483647;
        SolutionExcelSheetColumnNumber171 target = new SolutionExcelSheetColumnNumber171();
        int result = target.titleToNumber(input);
        assertEquals(output, result);
    }
}