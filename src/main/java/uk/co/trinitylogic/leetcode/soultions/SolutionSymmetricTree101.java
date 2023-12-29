package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

public class SolutionSymmetricTree101 {

    // https://leetcode.com/problems/symmetric-tree/

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirrorTree(root.left, root.right);
    }

    public boolean isMirrorTree(TreeNode p, TreeNode q) {
        StringBuilder psb = new StringBuilder();
        StringBuilder qsb = new StringBuilder();
        helper(p, q, psb, qsb);
        return psb.toString().contentEquals(qsb);
    }

    private void helper(TreeNode p, TreeNode q, StringBuilder psb, StringBuilder qsb) {
        if (p != null || q != null) {
            psb.append(p != null ? p.val : "*");
            qsb.append(q != null ? q.val : "*");

            TreeNode pNextL = p != null ? p.left : null;
            TreeNode qNextL = q != null ? q.right : null;

            TreeNode pNextR = p != null ? p.right : null;
            TreeNode qNextR = q != null ? q.left : null;

            helper(pNextL, qNextL, psb, qsb);
            helper(pNextR, qNextR, psb, qsb);
        }
    }
}
