package uk.co.trinitylogic.leetcode.soultions;

import java.util.HashMap;
import java.util.Map;

public class SolutionClimbingStairs70 {

    // https://leetcode.com/problems/climbing-stairs/

    public int climbStairs2(int n) {

        int pre = 1;
        int cur = 1;
        int tmp = 0;

        for (int i = 1; i < n; i++) {
            tmp = cur;
            cur = cur + pre;
            pre = tmp;
        }
        return cur;
    }

    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climb(n, memo);
    }

    private int climb(int n, Map<Integer, Integer> m) {

        if (m.containsKey(n)) {
            return m.get(n);
        }

        if (n == 1 || n == 2) {
            return n;
        }

        int r = (climb(n - 1, m) + climb(n - 2, m));
        m.put(n, r);
        return r;
    }
}
