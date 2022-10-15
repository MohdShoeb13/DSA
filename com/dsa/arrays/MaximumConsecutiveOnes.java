package com.dsa.arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(maximumOnes(new int[]{0,0,0,0}));
    }

    static int maximumOnes(int[] array){
        int max = 0;
        int count = 0;
        for (int j : array) {
            if (j == 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        if (count == array.length){
            max = count;
        }
        return max;
    }

    static int maxConsecutiveOnes(int[] array)
    {
        int res = 0, curr = 0;

        for (int j : array) {
            if (j == 0)
                curr = 0;
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }

        return res;
    }
}
