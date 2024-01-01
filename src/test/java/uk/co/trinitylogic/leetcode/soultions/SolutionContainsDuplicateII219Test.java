package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionContainsDuplicateII219Test {

    @Test
    void containsNearbyDuplicate_Example_1() {
        int[] input1 = new int[]{1, 2, 3, 1};
        int input2 = 3;
        boolean output = true;
        SolutionContainsDuplicateII219 target = new SolutionContainsDuplicateII219();
        boolean result = target.containsNearbyDuplicate(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void containsNearbyDuplicate_Example_2() {
        int[] input1 = new int[]{1, 0, 1, 1};
        int input2 = 1;
        boolean output = true;
        SolutionContainsDuplicateII219 target = new SolutionContainsDuplicateII219();
        boolean result = target.containsNearbyDuplicate(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void containsNearbyDuplicate_Example_3() {
        int[] input1 = new int[]{1, 2, 3, 1, 2, 3};
        int input2 = 2;
        boolean output = false;
        SolutionContainsDuplicateII219 target = new SolutionContainsDuplicateII219();
        boolean result = target.containsNearbyDuplicate(input1, input2);
        assertEquals(output, result);
    }

}