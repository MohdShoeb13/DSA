package com.dsa.arrays;

import java.util.Arrays;

public class MaxProfitEfficient {

    public static void main(String[] args) {
        int[] sharePrices = {5,2,6,1,4};
        System.out.println(maxProfitEfficient(sharePrices));
    }

    static int maxProfit(int[] sharePrices){
        int maxProfit = 0;
        int currentDifference = 0;

        for (int i = 0; i < sharePrices.length; i++){
            for (int j = i; j < sharePrices.length; j++){
                currentDifference = sharePrices[j] - sharePrices[i];
                maxProfit= Math.max(currentDifference,maxProfit);
            }
        }
        return maxProfit;
    }

    static int maxProfitEfficient(int[] sharePrices){
       int minSoFar = sharePrices[0];
       int maxProfit = 0;
        for (int sharePrice : sharePrices) {
            minSoFar = Math.min(minSoFar, sharePrice);
            int profit = sharePrice - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
       return maxProfit;
    }
}
