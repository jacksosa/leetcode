package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionAverageOfLevelsInBinaryTree637 {

    // https://leetcode.com/problems/average-of-levels-in-binary-tree/

    public List<Double> averageOfLevels(TreeNode root) {
        HashMap<Integer, Count> memo = new HashMap<>();
        helper(root, memo, 0);
        List<Double> r = new ArrayList<>();
        for (Map.Entry<Integer, Count> e : memo.entrySet()) {
            r.add(e.getValue().getResult());
        }
        return r;
    }

    private void helper(TreeNode n, HashMap<Integer, Count> r, int l) {
        if (n == null) {
            return;
        }
        if (r.containsKey(l)) {
            Count c = r.get(l);
            c.addV(n.val);
            c.inc();
        } else {
            Count c = new Count(n.val, 1);
            r.put(l, c);
        }
        l++;
        helper(n.right, r, l);
        helper(n.left, r, l);
    }

    private static class Count {
        private double v;
        private int c;

        Count(double v, int c) {
            this.v = v;
            this.c = c;
        }

        double getResult() {
            return v / c;
        }

        void addV(double v) {
            this.v = this.v + v;
        }

        void inc() {
            this.c = this.c + 1;
        }
    }
}
