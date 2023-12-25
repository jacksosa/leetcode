package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionFindTheIndexOfTheFirstOccurrenceInString28Test {

    @Test
    void strStr_Example_1() {
        String input1 = "sadbutsad";
        String input2 = "sad";
        int output = 0;
        // Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.
        SolutionFindTheIndexOfTheFirstOccurrenceInString28 target = new SolutionFindTheIndexOfTheFirstOccurrenceInString28();
        int result = target.strStr(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void strStr_Example_2() {
        String input1 = "leetcode";
        String input2 = "leeto";
        int output = -1;
        // Explanation: "leeto" did not occur in "leetcode", so we return -1.
        SolutionFindTheIndexOfTheFirstOccurrenceInString28 target = new SolutionFindTheIndexOfTheFirstOccurrenceInString28();
        int result = target.strStr(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void strStr_Example_3() {
        String input1 = "hello";
        String input2 = "ll";
        int output = 2;
        SolutionFindTheIndexOfTheFirstOccurrenceInString28 target = new SolutionFindTheIndexOfTheFirstOccurrenceInString28();
        int result = target.strStr(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void strStr_Example_4() {
        String input1 = "a";
        String input2 = "a";
        int output = 0;
        SolutionFindTheIndexOfTheFirstOccurrenceInString28 target = new SolutionFindTheIndexOfTheFirstOccurrenceInString28();
        int result = target.strStr(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void strStr_Example_5() {
        String input1 = "abc";
        String input2 = "c";
        int output = 2;
        SolutionFindTheIndexOfTheFirstOccurrenceInString28 target = new SolutionFindTheIndexOfTheFirstOccurrenceInString28();
        int result = target.strStr(input1, input2);
        assertEquals(output, result);
    }
}