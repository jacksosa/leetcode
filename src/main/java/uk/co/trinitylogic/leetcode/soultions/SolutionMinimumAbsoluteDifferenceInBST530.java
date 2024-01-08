package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionMinimumAbsoluteDifferenceInBST530 {

    // https://leetcode.com/problems/minimum-absolute-difference-in-bst/

    public int getMinimumDifference(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        helper(root, results);
        int i = 0;
        int m = Integer.MAX_VALUE;

        while (!results.isEmpty() && i < results.size() - 1) {
            int c = results.get(i + 1) - results.get(i);
            if (c < m) {
                m = c;
            }
            i++;
        }
        return m;
    }

    void helper(TreeNode n, List<Integer> r) {
        if (n == null) return;
        helper(n.left, r);
        r.add(n.val);
        helper(n.right, r);
    }
}
