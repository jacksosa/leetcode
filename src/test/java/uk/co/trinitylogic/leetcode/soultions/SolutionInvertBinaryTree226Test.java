package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionInvertBinaryTree226Test {

    @Test
    void invertTree_Example_1() {

        TreeNode input = new TreeNode(4);
        TreeNode node1i = new TreeNode(1);
        TreeNode node2i = new TreeNode(2);
        TreeNode node3i = new TreeNode(3);
        TreeNode node6i = new TreeNode(6);
        TreeNode node7i = new TreeNode(7);
        TreeNode node9i = new TreeNode(9);

        input.left = node2i;
        input.right = node7i;
        node2i.left = node1i;
        node2i.right = node3i;
        node7i.left = node6i;
        node7i.right = node9i;

        TreeNode output = new TreeNode(4);
        TreeNode node1o = new TreeNode(1);
        TreeNode node2o = new TreeNode(2);
        TreeNode node3o = new TreeNode(3);
        TreeNode node6o = new TreeNode(6);
        TreeNode node7o = new TreeNode(7);
        TreeNode node9o = new TreeNode(9);

        output.right = node2o;
        output.left = node7o;
        node2o.right = node1o;
        node2o.left = node3o;
        node7o.right = node6o;
        node7o.left = node9o;

        SolutionInvertBinaryTree226 target = new SolutionInvertBinaryTree226();
        TreeNode result = target.invertTree(input);
        assertEquals(output.toString(), result.toString());

    }

    @Test
    void invertTree_Example_2() {

        TreeNode input = new TreeNode(2);
        TreeNode node1i = new TreeNode(1);
        TreeNode node3i = new TreeNode(3);

        input.left = node1i;
        input.right = node3i;

        TreeNode output = new TreeNode(2);
        TreeNode node1o = new TreeNode(1);
        TreeNode node3o = new TreeNode(3);

        output.right = node1o;
        output.left = node3o;

        SolutionInvertBinaryTree226 target = new SolutionInvertBinaryTree226();
        TreeNode result = target.invertTree(input);
        assertEquals(output.toString(), result.toString());

    }

    @Test
    void invertTree_Example_3() {
        SolutionInvertBinaryTree226 target = new SolutionInvertBinaryTree226();
        TreeNode result = target.invertTree(null);
        assertNull(result);
    }
}