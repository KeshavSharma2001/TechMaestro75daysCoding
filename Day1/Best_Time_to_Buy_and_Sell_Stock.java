package com.Keshav.Day1;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] <min)
                min = prices[i];
        }
        int min_idx = findIndex(min, prices);

        int max = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] > max)
                max = prices[i];
        }
        int max_idx = findIndex(max, prices);

        if(min_idx < max_idx){
            int profit = prices[max_idx] - prices[min_idx];
            return profit;
        }
        return 0;
    }

    public static int findIndex(int min, int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] == min)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);

    }
}
