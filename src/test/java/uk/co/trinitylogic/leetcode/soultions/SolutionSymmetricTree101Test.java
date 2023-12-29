package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSymmetricTree101Test {

    @Test
    void isSymmetric_Example_1() {

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
        node2a.right = node4a;
        node2b.left = node4b;
        node2b.right = node3b;

        boolean output = true;

        SolutionSymmetricTree101 target = new SolutionSymmetricTree101();
        boolean result = target.isSymmetric(input);

        assertEquals(output, result);
    }

    @Test
    void isSymmetric_Example_2() {

        TreeNode input = new TreeNode(1);
        TreeNode node2a = new TreeNode(2);
        TreeNode node2b = new TreeNode(2);
        TreeNode node3a = new TreeNode(3);
        TreeNode node3b = new TreeNode(3);

        input.left = node2a;
        input.right = node2b;
        node2a.left = node3a;
        node2a.right = node3a;
        node2b.right = node3b;

        boolean output = false;

        SolutionSymmetricTree101 target = new SolutionSymmetricTree101();
        boolean result = target.isSymmetric(input);

        assertEquals(output, result);
    }

    @Test
    void isSymmetric_Example_3() {

        TreeNode input = new TreeNode(1);
        TreeNode node2a = new TreeNode(2);
        TreeNode node2b = new TreeNode(2);
        TreeNode node3a = new TreeNode(3);
        TreeNode node3b = new TreeNode(3);
        TreeNode node1b = new TreeNode(-1);

        input.left = node2a;
        input.right = node2b;
        node2a.left = node3a;
        node2b.left = node1b;
        node2b.right = node3b;

        boolean output = false;

        SolutionSymmetricTree101 target = new SolutionSymmetricTree101();
        boolean result = target.isSymmetric(input);

        assertEquals(output, result);
    }
}