package com.dsa.arrays;

public class MaximumDifferenceProblem {
    public static void main(String[] args) {
        System.out.println(maximumDiffEfficient(new int[]{10,20,30}));;
    }

    static void maximumDifference(int[] array){
        int diff = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            for (int j = 0 ; j < array.length; j++){
                if(j > i) {
                    int d = array[j] - array[i];
                    if(d > diff)
                        diff = d;
                }
            }
        }
        System.out.println(diff);
    }

    static int maximumDiffEfficient(int[] array){
        int result = array[1] - array[0], minValue = array[0];
        for (int i = 1; i < array.length; i++){
            result = Math.max(result, array[i] - minValue);
            minValue = Math.min(minValue, array[i]);
        }
        return result;
    }
}
