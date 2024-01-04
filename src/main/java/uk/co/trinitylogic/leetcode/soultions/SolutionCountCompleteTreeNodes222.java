package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

public class SolutionCountCompleteTreeNodes222 {

    // https://leetcode.com/problems/count-complete-tree-nodes/

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, 1);
    }

    private int helper(TreeNode node, int count) {
        if (node.left == null && node.right == null) {
            return count;
        }
        if (node.left != null) {
            count = helper(node.left, ++count);
        }
        if (node.right != null) {
            count = helper(node.right, ++count);
        }
        return count;
    }
}
