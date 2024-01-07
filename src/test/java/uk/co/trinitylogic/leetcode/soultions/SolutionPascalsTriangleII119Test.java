package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionPascalsTriangleII119Test {

    @Test
    void getRow_Example_1() {
        int input = 3;
        List<Integer> output = List.of(1, 3, 3, 1);
        SolutionPascalsTriangleII119 target = new SolutionPascalsTriangleII119();
        List<Integer> result = target.getRow(input);
        assertEquals(output, result);
    }

    @Test
    void getRow_Example_2() {
        int input = 0;
        List<Integer> output = List.of(1);
        SolutionPascalsTriangleII119 target = new SolutionPascalsTriangleII119();
        List<Integer> result = target.getRow(input);
        assertEquals(output, result);
    }

    @Test
    void getRow_Example_3() {
        int input = 1;
        List<Integer> output = List.of(1, 1);
        SolutionPascalsTriangleII119 target = new SolutionPascalsTriangleII119();
        List<Integer> result = target.getRow(input);
        assertEquals(output, result);
    }
}