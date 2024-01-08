package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionMinimumAbsoluteDifferenceInBST530Test {

    @Test
    void getMinimumDifference_Example_1() {
        TreeNode input = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node6 = new TreeNode(6);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        input.left = node2;
        input.right = node6;
        node2.left = node1;
        node2.right = node3;
        int output = 1;
        SolutionMinimumAbsoluteDifferenceInBST530 target = new SolutionMinimumAbsoluteDifferenceInBST530();
        int result = target.getMinimumDifference(input);
        assertEquals(output, result);
    }

    @Test
    void getMinimumDifference_Example_2() {
        TreeNode input = new TreeNode(1);
        TreeNode node0 = new TreeNode(0);
        TreeNode node48 = new TreeNode(48);
        TreeNode node12 = new TreeNode(12);
        TreeNode node49 = new TreeNode(49);
        input.left = node0;
        input.right = node48;
        node48.left = node12;
        node48.right = node49;
        int output = 1;
        SolutionMinimumAbsoluteDifferenceInBST530 target = new SolutionMinimumAbsoluteDifferenceInBST530();
        int result = target.getMinimumDifference(input);
        assertEquals(output, result);
    }

    @Test
    void getMinimumDifference_Example_3() {
        TreeNode input = new TreeNode(1);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        input.right = node5;
        node5.left = node3;
        int output = 2;
        SolutionMinimumAbsoluteDifferenceInBST530 target = new SolutionMinimumAbsoluteDifferenceInBST530();
        int result = target.getMinimumDifference(input);
        assertEquals(output, result);
    }

    @Test
    void getMinimumDifference_Example_4() {
        TreeNode input = new TreeNode(236);
        TreeNode node104 = new TreeNode(104);
        TreeNode node701 = new TreeNode(701);
        TreeNode node227 = new TreeNode(227);
        TreeNode node911 = new TreeNode(911);
        input.left = node104;
        input.right = node701;
        node104.right = node227;
        node701.right = node911;
        int output = 9;
        SolutionMinimumAbsoluteDifferenceInBST530 target = new SolutionMinimumAbsoluteDifferenceInBST530();
        int result = target.getMinimumDifference(input);
        assertEquals(output, result);
    }
}