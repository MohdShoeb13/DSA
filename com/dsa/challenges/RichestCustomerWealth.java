package com.dsa.challenges;

import com.dsa.Main;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] bankDetails = {{2,8,7},{7,1,3},{1,9,5}};
        int maxWealth = 0;

        for (int i = 0; i < bankDetails.length; i++){
            int wealth = 0;
            for (int j = 0; j < bankDetails[i].length; j++){
                wealth += bankDetails[i][j];
            }
            maxWealth = Math.max(wealth,maxWealth);
        }

        System.out.println(maxWealth);
    }
}
