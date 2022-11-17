package com.dsa.arrays;

public class BettingGame {
    public static void main(String[] args) {
        System.out.println(betBalance("WLWLLLWWLW"));
    }

    static int betBalance(String result)
    {
        int currentSum = 4;
        int betAmount = 1;

        for(int i = 0; i < result.length(); i++){

            if(currentSum < betAmount) return -1;

            if (result.charAt(i) == 'W'){
                currentSum+=betAmount;
                betAmount = 1;
            }else {
                currentSum-=betAmount;
                betAmount= 2 * betAmount;
            }
        }

        return currentSum >= 0 ? currentSum : -1;
    }
}
