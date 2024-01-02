package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionExcelSheetColumnTitle168Test {

    @Test
    void convertToTitle_Example_1() {
        int input = 1;
        String output = "A";
        SolutionExcelSheetColumnTitle168 target = new SolutionExcelSheetColumnTitle168();
        String result = target.convertToTitle(input);
        assertEquals(output, result);
    }

    @Test
    void convertToTitle_Example_2() {
        int input = 28;
        String output = "AB";
        SolutionExcelSheetColumnTitle168 target = new SolutionExcelSheetColumnTitle168();
        String result = target.convertToTitle(input);
        assertEquals(output, result);
    }

    @Test
    void convertToTitle_Example_3() {
        int input = 701;
        String output = "ZY";
        SolutionExcelSheetColumnTitle168 target = new SolutionExcelSheetColumnTitle168();
        String result = target.convertToTitle(input);
        assertEquals(output, result);
    }

    @Test
    void convertToTitle_Example_4() {
        int input = 2147483647;
        String output = "FXSHRXW";
        SolutionExcelSheetColumnTitle168 target = new SolutionExcelSheetColumnTitle168();
        String result = target.convertToTitle(input);
        assertEquals(output, result);
    }
}