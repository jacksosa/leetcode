package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionPathSumTest {

    @Test
    void hasPathSum_Example_1() {
        // [5,4,8,11,null,13,4,7,2,null,null,null,1],
        TreeNode input1 = new TreeNode(5);
        TreeNode node4l1 = new TreeNode(4);
        TreeNode node8l1 = new TreeNode(8);

        TreeNode node11l2 = new TreeNode(11);
        TreeNode node13l2 = new TreeNode(13);
        TreeNode node4l2 = new TreeNode(4);

        TreeNode node7l3 = new TreeNode(7);
        TreeNode node2l3 = new TreeNode(2);
        TreeNode node1l3 = new TreeNode(1);

        input1.left = node4l1;
        input1.right = node8l1;

        node4l1.left = node11l2;
        node11l2.left = node7l3;
        node11l2.right = node2l3;

        node8l1.left = node13l2;
        node8l1.right = node4l2;
        node4l2.right = node1l3;


        int input2 = 22;
        boolean output = true;
        // Explanation: The root-to-leaf path with the target sum is shown.

        SolutionPathSum target = new SolutionPathSum();
        boolean result = target.hasPathSum(input1, input2);

        assertEquals(output, result);
    }

    @Test
    void hasPathSum_Example_2() {
        int input2 = 0;
        boolean output = false;
        // Explanation: Since the tree is empty, there are no root-to-leaf paths.

        SolutionPathSum target = new SolutionPathSum();
        boolean result = target.hasPathSum(null, input2);

        assertEquals(output, result);
    }

    @Test
    void hasPathSum_Example_4() {
        // [1,2]
        TreeNode input1 = new TreeNode(1);
        input1.left = new TreeNode(2);

        int input2 = 2;
        boolean output = false;

        SolutionPathSum target = new SolutionPathSum();
        boolean result = target.hasPathSum(input1, input2);

        assertEquals(output, result);
    }
}