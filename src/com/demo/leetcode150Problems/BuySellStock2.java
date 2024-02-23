package com.demo.leetcode150Problems;

public class BuySellStock2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buySell(prices));
    }

    public static int buySell(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit = profit + prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
