package com.demo.hundredDaysOfCode;

public class Day9 {
    public static void main(String[] args) {


        //You are given an array prices where prices[i] is the price of a given stock on the ith day.

        int[] prices = {2,5,19,5,1,9};
        // finding minimum of the number
        // finding the maximum out of the rest
        /*int min = Integer.MAX_VALUE;
        int profit = 0;
        int day = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                day = i;
            }
        }
        if (day == prices.length-1) {
            System.out.println(profit);
        }
        else {
            for (int j = day+1; j < prices.length; j++) {
                if (prices[j] - prices[day] >= profit) {
                    profit= prices[j] - prices[day];
                }
            }
            System.out.println(profit);
        }*/
        // failing for {2,4,1} it should give profit of 2 but returning 0
        // new approach
        /* it fails because it exceeds the time limit
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (profit < prices[j]-prices[i]) {
                    profit = prices[j]-prices[i];
                }
            }
        }
        System.out.println(profit);*/

        // new approach
        // find the maximum and then the minimum before that
        // test case {9, 7, 3, 6, 7, 8, 1}

        int x = prices[0];
        int profit = 0;
        int minPrice = 0;
        for (int price: prices ) {
            if (x > price) {
                x = price;
            }
            if (profit <price - x) {
                profit = price -  x;
                minPrice = x;
            }
        }
        System.out.println(profit);
        System.out.println(minPrice);
        System.out.println(x);
        /*Result : Runtime: 2 ms, faster than 93.29% of Java online submissions for Best Time to Buy and Sell Stock.
                Memory Usage: 58.4 MB, less than 98.68% of Java online submissions for Best Time to Buy and Sell Stock.*/




    }
}
