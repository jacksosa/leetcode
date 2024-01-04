package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSummaryRanges228Test {

    @Test
    void summaryRanges_Example_1() {
        int[] input = new int[]{0, 1, 2, 4, 5, 7};
        List<String> output = List.of("0->2", "4->5", "7");
        // Explanation: The ranges are:
        //      [0,2] --> "0->2"
        //      [4,5] --> "4->5"
        //      [7,7] --> "7"
        SolutionSummaryRanges228 target = new SolutionSummaryRanges228();
        List<String> result = target.summaryRanges(input);
        assertEquals(output.toString(), result.toString());
    }

    @Test
    void summaryRanges_Example_2() {
        int[] input = new int[]{0, 2, 3, 4, 6, 8, 9};
        List<String> output = List.of("0", "2->4", "6", "8->9");
        // Explanation: The ranges are:
        //      [0,0] --> "0"
        //      [2,4] --> "2->4"
        //      [6,6] --> "6"
        //      [8,9] --> "8->9"
        SolutionSummaryRanges228 target = new SolutionSummaryRanges228();
        List<String> result = target.summaryRanges(input);
        assertEquals(output.toString(), result.toString());
    }

    @Test
    void summaryRanges_Example_3() {
        int[] input = new int[]{2147483645, 2147483646};
        List<String> output = List.of("2147483645->2147483646");
        SolutionSummaryRanges228 target = new SolutionSummaryRanges228();
        List<String> result = target.summaryRanges(input);
        assertEquals(output.toString(), result.toString());
    }
}