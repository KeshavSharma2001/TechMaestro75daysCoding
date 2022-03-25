package com.Keshav.Day1;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int min_price = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
//            if we have a lesser price for the stock
            if(prices[i] < min_price) {
                min_price = prices[i];
            }
//            difference of current price of stock with minimum price and compare with profit --> to have max profit
            else if(prices[i] - min_price > profit){
                profit = prices[i] - min_price;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,0,0,0,5};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}
