package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionBinaryTreePostorderTraversal145 {

    // https://leetcode.com/problems/binary-tree-postorder-traversal/

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result.reversed();
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        helper(root.right, result);
        helper(root.left, result);
    }
}
