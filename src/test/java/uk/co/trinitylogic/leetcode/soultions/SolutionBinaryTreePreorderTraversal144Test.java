package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionBinaryTreePreorderTraversal144Test {

    @Test
    void preorderTraversal_Example_1() {
        TreeNode input = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        input.right = node2;
        node2.left = node3;
        List<Integer> output = List.of(1, 2, 3);
        SolutionBinaryTreePreorderTraversal144 target = new SolutionBinaryTreePreorderTraversal144();
        List<Integer> result = target.preorderTraversal(input);
        assertEquals(output, result);
    }

    @Test
    void preorderTraversal_Example_2() {
        TreeNode input = null;
        List<Integer> output = Collections.emptyList();
        SolutionBinaryTreePreorderTraversal144 target = new SolutionBinaryTreePreorderTraversal144();
        List<Integer> result = target.preorderTraversal(input);
        assertEquals(output, result);
    }

    @Test
    void preorderTraversal_Example_3() {
        TreeNode input = new TreeNode(1);
        List<Integer> output = List.of(1);
        SolutionBinaryTreePreorderTraversal144 target = new SolutionBinaryTreePreorderTraversal144();
        List<Integer> result = target.preorderTraversal(input);
        assertEquals(output, result);
    }
}