package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionBalancedBinaryTree110Test {

    @Test
    void isBalanced_Example_1() {
        TreeNode input = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        input.left = node9;
        input.right = node20;
        node20.left = node15;
        node20.right = node7;
        boolean output = true;
        SolutionBalancedBinaryTree110 target = new SolutionBalancedBinaryTree110();
        boolean result = target.isBalanced(input);
        assertEquals(output, result);
    }

    @Test
    void isBalanced_Example_2() {
        TreeNode input = new TreeNode(1);
        TreeNode node2a = new TreeNode(2);
        TreeNode node2b = new TreeNode(2);
        TreeNode node3a = new TreeNode(3);
        TreeNode node3b = new TreeNode(3);
        TreeNode node4a = new TreeNode(4);
        TreeNode node4b = new TreeNode(4);
        input.left = node2a;
        input.right = node2b;
        node2a.left = node3a;
        node2a.right = node3b;
        node3a.left = node4a;
        node3a.right = node4b;
        boolean output = false;
        SolutionBalancedBinaryTree110 target = new SolutionBalancedBinaryTree110();
        boolean result = target.isBalanced(input);
        assertEquals(output, result);
    }

    @Test
    void isBalanced_Example_3() {
        TreeNode input = null;
        boolean output = true;
        SolutionBalancedBinaryTree110 target = new SolutionBalancedBinaryTree110();
        boolean result = target.isBalanced(input);
        assertEquals(output, result);
    }
}