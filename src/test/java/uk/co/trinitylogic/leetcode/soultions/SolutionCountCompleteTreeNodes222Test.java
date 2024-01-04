package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionCountCompleteTreeNodes222Test {

    @Test
    void countNodes_Example_1() {
        TreeNode input = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        input.left = node2;
        input.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        int output = 6;
        SolutionCountCompleteTreeNodes222 target = new SolutionCountCompleteTreeNodes222();
        int result = target.countNodes(input);
        assertEquals(output, result);
    }

    @Test
    void countNodes_Example_2() {
        int output = 0;
        SolutionCountCompleteTreeNodes222 target = new SolutionCountCompleteTreeNodes222();
        int result = target.countNodes(null);
        assertEquals(output, result);
    }

    @Test
    void countNodes_Example_3() {
        int output = 1;
        SolutionCountCompleteTreeNodes222 target = new SolutionCountCompleteTreeNodes222();
        int result = target.countNodes(new TreeNode(1));
        assertEquals(output, result);
    }
}