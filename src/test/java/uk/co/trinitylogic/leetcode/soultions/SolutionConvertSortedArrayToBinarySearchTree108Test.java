package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionConvertSortedArrayToBinarySearchTree108Test {

    @Test
    void sortedArrayToBST_Example_1() {

        int[] input = new int[]{-10, -3, 0, 5, 9};
        String output = "0, left: -10, right: -3, right: 5, right: 9";
        // Explanation: [0,-10,5,null,-3,null,9] is also accepted:

        SolutionConvertSortedArrayToBinarySearchTree108 target = new SolutionConvertSortedArrayToBinarySearchTree108();
        TreeNode result = target.sortedArrayToBST(input);
        assertEquals(output, result.toString());
    }

    @Test
    void sortedArrayToBST_Example_2() {

        int[] input = new int[]{1, 3};
        String output = "1, right: 3";
        // Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.

        SolutionConvertSortedArrayToBinarySearchTree108 target = new SolutionConvertSortedArrayToBinarySearchTree108();
        TreeNode result = target.sortedArrayToBST(input);
        assertEquals(output, result.toString());
    }
}