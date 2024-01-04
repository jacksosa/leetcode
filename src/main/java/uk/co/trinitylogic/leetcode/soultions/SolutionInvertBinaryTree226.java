package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

public class SolutionInvertBinaryTree226 {

    // https://leetcode.com/problems/invert-binary-tree/

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        helper(root, root.left, root.right);
        return root;
    }

    private void helper(TreeNode n, TreeNode l, TreeNode r) {
        n.left = r;
        n.right = l;
        if (l != null) {
            helper(l, l.left, l.right);
        }
        if (r != null) {
            helper(r, r.left, r.right);
        }
    }
}
