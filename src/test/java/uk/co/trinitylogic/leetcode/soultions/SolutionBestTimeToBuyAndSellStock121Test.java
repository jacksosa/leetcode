package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionBestTimeToBuyAndSellStock121Test {

    @Test
    void maxProfit_Example_1() {
        int[] input = new int[]{7, 1, 5, 3, 6, 4};
        int output = 5;
        // Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        // Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        SolutionBestTimeToBuyAndSellStock121 target = new SolutionBestTimeToBuyAndSellStock121();
        int result = target.maxProfit(input);
        assertEquals(output, result);
    }

    @Test
    void maxProfit_Example_2() {
        int[] input = new int[]{7,6,4,3,1};
        int output = 0;
        // Explanation: In this case, no transactions are done and the max profit = 0.
        SolutionBestTimeToBuyAndSellStock121 target = new SolutionBestTimeToBuyAndSellStock121();
        int result = target.maxProfit(input);
        assertEquals(output, result);
    }
}