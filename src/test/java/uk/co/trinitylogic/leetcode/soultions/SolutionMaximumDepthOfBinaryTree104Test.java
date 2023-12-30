package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionMaximumDepthOfBinaryTree104Test {

    @Test
    void maxDepth_Example_1() {

        TreeNode input = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        input.left = node9;
        input.right = node20;
        node20.left = node15;
        node7.right = node7;

        int output = 3;

        SolutionMaximumDepthOfBinaryTree104 target = new SolutionMaximumDepthOfBinaryTree104();
        int result = target.maxDepth(input);
        assertEquals(output, result);
    }

    @Test
    void maxDepth_Example_2() {

        TreeNode input = new TreeNode(1);
        input.right = new TreeNode(2);

        int output = 2;

        SolutionMaximumDepthOfBinaryTree104 target = new SolutionMaximumDepthOfBinaryTree104();
        int result = target.maxDepth(input);
        assertEquals(output, result);
    }

    @Test
    void maxDepth_Example_3() {
        int output = 0;
        SolutionMaximumDepthOfBinaryTree104 target = new SolutionMaximumDepthOfBinaryTree104();
        int result = target.maxDepth(null);
        assertEquals(output, result);
    }

    @Test
    void maxDepth_Example_4() {

        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(3);

        int output = 2;

        SolutionMaximumDepthOfBinaryTree104 target = new SolutionMaximumDepthOfBinaryTree104();
        int result = target.maxDepth(input);
        assertEquals(output, result);
    }
}