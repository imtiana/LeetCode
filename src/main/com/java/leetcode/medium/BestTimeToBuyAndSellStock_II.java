package main.com.java.leetcode.medium;

/**
 * Created by Tiana Im on 2015-12-13.
 */
public class BestTimeToBuyAndSellStock_II {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int incSum = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                incSum += prices[i] - prices[i-1];
            }
        }

        return incSum;
    }
}
