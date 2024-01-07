package uk.co.trinitylogic.leetcode.soultions;


import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

public class SolutionMinimumDepthOfBinaryTree111 {

    // https://leetcode.com/problems/minimum-depth-of-binary-tree/

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return r + 1;
        }
        if (root.right == null) {
            return l + 1;
        }
        return Math.min(l, r) + 1;
    }
}
