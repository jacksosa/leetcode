package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionLongestCommonPrefix14Test {

    @Test
    void longestCommonPrefix_Example_1() {
        String[] input = new String[]{"flower", "flow", "flight"};
        String output = "fl";
        SolutionLongestCommonPrefix14 target = new SolutionLongestCommonPrefix14();
        String result = target.longestCommonPrefix(input);
        Assertions.assertEquals(output, result);
    }

    @Test
    void longestCommonPrefix_Example_2() {
        String[] input = new String[]{"dog", "racecar", "car"};
        String output = "";
        // Explanation: There is no common prefix among the input strings.
        SolutionLongestCommonPrefix14 target = new SolutionLongestCommonPrefix14();
        String result = target.longestCommonPrefix(input);
        Assertions.assertEquals(output, result);
    }

    @Test
    void longestCommonPrefix_Example_3() {
        String[] input = new String[]{"a"};
        String output = "a";
        SolutionLongestCommonPrefix14 target = new SolutionLongestCommonPrefix14();
        String result = target.longestCommonPrefix(input);
        Assertions.assertEquals(output, result);
    }

    @Test
    void longestCommonPrefix_Example_4() {
        String[] input = new String[]{"ab", "a"};
        String output = "a";
        SolutionLongestCommonPrefix14 target = new SolutionLongestCommonPrefix14();
        String result = target.longestCommonPrefix(input);
        Assertions.assertEquals(output, result);
    }
}