package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

public class SolutionSameTree100 {

    // https://leetcode.com/problems/same-tree/

    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder psb = new StringBuilder();
        StringBuilder qsb = new StringBuilder();
        helper(p, q, psb, qsb);
        return psb.toString().contentEquals(qsb);
    }

    private void helper(TreeNode p, TreeNode q, StringBuilder psb, StringBuilder qsb) {
        if (p != null || q != null) {

            psb.append(p != null ? p.val : -1);
            qsb.append(q != null ? q.val : -1);

            TreeNode pNextL = p != null ? p.left : null;
            TreeNode qNextL = q != null ? q.left : null;

            TreeNode pNextR = p != null ? p.right : null;
            TreeNode qNextR = q != null ? q.right : null;


            helper(pNextL, qNextL, psb, qsb);
            helper(pNextR, qNextR, psb, qsb);
        }
    }
}
