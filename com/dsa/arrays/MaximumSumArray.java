package com.dsa.arrays;

public class MaximumSumArray {
    public static void main(String[] args) {
        int[] array = {-1,-2,-3,-1,-3};
        System.out.println(maxSumEfficient(array));
    }

    static int maxSumSubArray(int[] array){
        int result = array[0];
        for (int i = 0; i < array.length; i++){
            int current = 0;
            for (int j = i; j < array.length; j++){
                current+=array[j];
                result = Math.max(result,current);
            }
        }
        return result;
    }

    static int maxSumEfficient(int[] array){
        int result = array[0];
        int maxEnding = array[0];
        for (int i = 1; i < array.length; i++){
            maxEnding = Math.max(maxEnding+array[i],array[i]);
            result = Math.max(result,maxEnding);
        }
        return result;
    }
}
