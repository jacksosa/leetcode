package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionAverageOfLevelsInBinaryTree637Test {

    @Test
    void averageOfLevels_Example_1() {
        TreeNode input = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        input.left = node9;
        input.right = node20;
        node20.left = node15;
        node20.right = node7;
        List<Double> output = List.of(3.00000, 14.50000, 11.00000);
        // Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
        // Hence return [3, 14.5, 11].
        SolutionAverageOfLevelsInBinaryTree637 target = new SolutionAverageOfLevelsInBinaryTree637();
        List<Double> result = target.averageOfLevels(input);
        assertEquals(output, result);
    }

    @Test
    void averageOfLevels_Example_2() {
        TreeNode input = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        input.left = node9;
        input.right = node20;
        node9.left = node15;
        node9.right = node7;
        List<Double> output = List.of(3.00000, 14.50000, 11.00000);
        SolutionAverageOfLevelsInBinaryTree637 target = new SolutionAverageOfLevelsInBinaryTree637();
        List<Double> result = target.averageOfLevels(input);
        assertEquals(output, result);
    }

    @Test
    void averageOfLevels_Example_3() {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(1);
        List<Double> output = List.of(1.00000,1.00000);
        SolutionAverageOfLevelsInBinaryTree637 target = new SolutionAverageOfLevelsInBinaryTree637();
        List<Double> result = target.averageOfLevels(input);
        assertEquals(output, result);
    }
}