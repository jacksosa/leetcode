package uk.co.trinitylogic.leetcode.soultions;

import java.util.ArrayList;
import java.util.List;

public class SolutionSummaryRanges228 {

    // https://leetcode.com/problems/summary-ranges/

    public List<String> summaryRanges(int[] nums) {

        int s = 0;
        int c = 0;
        int f = 1;

        List<String> r = new ArrayList<>();

        while (c < nums.length) {

            int vs = nums[s];
            int vc = nums[c];
            int vf;
            if (f < nums.length) {
                vf = nums[f];
            } else {
                vf = vc - 100;
            }

            if (vc == vf - 1) {
                f++;
                c++;
            } else {
                if (vs != vc) {
                    r.add(vs + "->" + vc);
                } else {
                    r.add(Integer.toString(vs));
                }
                s = f;
                f = f + 1;
                c = s;
            }
        }
        return r;
    }
}
