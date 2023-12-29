package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSameTree100Test {

    @Test
    void isSameTree_Example_1() {

        TreeNode input1 = new TreeNode(1);
        TreeNode node2a = new TreeNode(2);
        TreeNode node3a = new TreeNode(3);
        input1.left = node2a;
        input1.right = node3a;

        TreeNode input2 = new TreeNode(1);
        TreeNode node2b = new TreeNode(2);
        TreeNode node3b = new TreeNode(3);
        input2.left = node2b;
        input2.right = node3b;

        boolean output = true;

        SolutionSameTree100 target = new SolutionSameTree100();
        boolean result = target.isSameTree(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isSameTree_Example_2() {

        TreeNode input1 = new TreeNode(1);
        input1.left = new TreeNode(2);

        TreeNode input2 = new TreeNode(1);
        input2.right = new TreeNode(2);

        boolean output = false;

        SolutionSameTree100 target = new SolutionSameTree100();
        boolean result = target.isSameTree(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isSameTree_Example_3() {

        TreeNode input1 = new TreeNode(1);
        TreeNode node2a = new TreeNode(2);
        TreeNode node1a = new TreeNode(1);
        input1.left = node2a;
        input1.right = node1a;

        TreeNode input2 = new TreeNode(1);
        TreeNode node2b = new TreeNode(2);
        input2.left = new TreeNode(1);
        input2.right = node2b;

        boolean output = false;

        SolutionSameTree100 target = new SolutionSameTree100();
        boolean result = target.isSameTree(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void isSameTree_Example_4() {
        TreeNode input2 = new TreeNode(0);
        boolean output = false;
        SolutionSameTree100 target = new SolutionSameTree100();
        boolean result = target.isSameTree(null, input2);
        assertEquals(output, result);
    }

    @Test
    void isSameTree_Example_5() {

        TreeNode input1 = new TreeNode(1);

        TreeNode input2 = new TreeNode(1);
        TreeNode node2b = new TreeNode(2);
        input2.left = null;
        input2.right = node2b;

        boolean output = false;

        SolutionSameTree100 target = new SolutionSameTree100();
        boolean result = target.isSameTree(input1, input2);
        assertEquals(output, result);
    }
}