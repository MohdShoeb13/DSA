package com.dsa.arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {1,5,3,8,12};
        System.out.println(maxProfit(prices,0,prices.length-1));
        System.out.println(maxProfitEfficient(prices));
    }

    static int maxProfit(int[] prices, int start, int end){
        if(end <= start) return 0;
        int profit = 0;
        for(int i = start; i < end; i++){
            for (int j = i + 1; j <= end; j++){
                if (prices[j] > prices[i]){
                    int currentProfit = prices[j] - prices[i] + maxProfit(prices,start,i-1) + maxProfit(prices,j+1,end);
                    profit = Math.max(profit,currentProfit);
                }
            }

        }
        return  profit;
    }

    static int maxProfitEfficient(int[] stockPrices){
        int profit  = 0;
        for (int i = 1; i < stockPrices.length; i++){
            if(stockPrices[i] > stockPrices[i-1]){
                profit+=(stockPrices[i] - stockPrices[i-1]);
            }
        }
        return profit;
    }
}
