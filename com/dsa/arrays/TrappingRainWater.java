package com.dsa.arrays;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        System.out.println(getWater(arr));
    }

    static int getWater(int[] array)
    {
        int res = 0;

        for(int i = 1; i < array.length - 1; i++)
        {
            int lMax = array[i];

            for(int j = 0; j < i; j++)
                lMax = Math.max(lMax, array[j]);

            int rMax = array[i];

            for(int j = i + 1; j < array.length; j++)
                rMax = Math.max(rMax, array[j]);

            res = res + (Math.min(lMax, rMax) - array[i]);
        }

        return res;
    }

    static int getWaterEfficient(int[] array)
    {
        int res = 0;

        int lMax[] = new int[array.length];
        int rMax[] = new int[array.length];

        lMax[0] = array[0];
        for(int i = 1; i < array.length; i++)
            lMax[i] = Math.max(array[i], lMax[i - 1]);


        rMax[array.length - 1] = array[array.length - 1];
        for(int i = array.length - 2; i >= 0; i--)
            rMax[i] = Math.max(array[i], rMax[i + 1]);

        for(int i = 1; i < array.length - 1; i++)
            res = res + (Math.min(lMax[i], rMax[i]) - array[i]);

        return res;
    }

}
