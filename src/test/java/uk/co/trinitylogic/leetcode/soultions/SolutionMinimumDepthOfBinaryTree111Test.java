package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionMinimumDepthOfBinaryTree111Test {

    @Test
    void minDepth_Example_1() {
        TreeNode input = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        input.left = node9;
        input.right = node20;
        node20.left = node15;
        node20.right = node7;
        int output = 2;
        SolutionMinimumDepthOfBinaryTree111 target = new SolutionMinimumDepthOfBinaryTree111();
        int result = target.minDepth(input);
        assertEquals(output, result);
    }

    @Test
    void minDepth_Example_2() {
        TreeNode input = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        input.right = node3;
        node3.right = node4;
        node4.right = node5;
        node5.right = node6;
        int output = 5;
        SolutionMinimumDepthOfBinaryTree111 target = new SolutionMinimumDepthOfBinaryTree111();
        int result = target.minDepth(input);
        assertEquals(output, result);
    }
}