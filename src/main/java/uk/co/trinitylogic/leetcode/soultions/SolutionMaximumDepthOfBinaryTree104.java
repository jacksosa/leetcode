package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

public class SolutionMaximumDepthOfBinaryTree104 {

    // https://leetcode.com/problems/maximum-depth-of-binary-tree/

    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode node, int depth) {
        if (node != null) {
            int leftDepth = helper(node.left, (depth + 1));
            int rightDepth = helper(node.right, (depth + 1));
            return Math.max(leftDepth, rightDepth);
        }
        return depth;
    }
}
