package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

public class SolutionConvertSortedArrayToBinarySearchTree108 {

    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.right = helper(nums, mid + 1, right);
        node.left = helper(nums, left, mid - 1);
        return node;
    }
}
