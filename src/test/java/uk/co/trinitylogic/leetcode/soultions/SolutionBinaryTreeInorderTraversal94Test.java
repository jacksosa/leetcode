package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import java.util.List;

class SolutionBinaryTreeInorderTraversal94Test {

    @Test
    void inorderTraversal_Example_1() {
        TreeNode input = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        input.right = node2;
        node2.left = node3;

        List<Integer> output = List.of(1, 3, 2);

        SolutionBinaryTreeInorderTraversal94 target = new SolutionBinaryTreeInorderTraversal94();
        List<Integer> result = target.inorderTraversal(input);
        Assertions.assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void inorderTraversal_Example_2() {
        TreeNode input = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5a = new TreeNode(5);
        TreeNode node5b = new TreeNode(5);

        input.left = node2;
        node2.left = node4;
        node2.right = node5a;
        input.right = node3;
        node3.right = node5b;


        List<Integer> output = List.of(4, 2, 5, 1, 3, 5);

        SolutionBinaryTreeInorderTraversal94 target = new SolutionBinaryTreeInorderTraversal94();
        List<Integer> result = target.inorderTraversal(input);
        Assertions.assertArrayEquals(output.toArray(), result.toArray());
    }
}