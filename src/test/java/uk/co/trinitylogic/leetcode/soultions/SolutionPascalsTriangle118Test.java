package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionPascalsTriangle118Test {

    @Test
    void generate_Example_1() {
        int input = 5;
        List<Integer> level1 = List.of(1);
        List<Integer> level2 = List.of(1, 1);
        List<Integer> level3 = List.of(1, 2, 1);
        List<Integer> level4 = List.of(1, 3, 3, 1);
        List<Integer> level5 = List.of(1, 4, 6, 4, 1);
        List<List<Integer>> output = List.of(level1, level2, level3, level4, level5);
        SolutionPascalsTriangle118 target = new SolutionPascalsTriangle118();
        List<List<Integer>> result = target.generate(input);
        assertEquals(output, result);
    }

    @Test
    void generate_Example_2() {
        int input = 1;
        List<Integer> level1 = List.of(1);
        List<List<Integer>> output = List.of(level1);
        SolutionPascalsTriangle118 target = new SolutionPascalsTriangle118();
        List<List<Integer>> result = target.generate(input);
        assertEquals(output, result);
    }
}