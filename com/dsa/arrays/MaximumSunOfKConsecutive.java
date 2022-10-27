package com.dsa.arrays;

public class MaximumSunOfKConsecutive {
    public static void main(String[] args) {
      int[] array = {10,5,-2,20,1};
        System.out.println(maxSum(array,3));
    }

    static int maxSum(int[] array,int k){
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i + k - 1 < array.length; i++){
            int current = 0;
            for(int j = 0; j < k; j++){
               current += array[i+j];
            }
            sum = Math.max(sum,current);
        }
        return sum;
    }

    /**
     * this solution uses sliding window technique
     * @param array
     * @param k
     * @return
     */
    static int maxSumEfficient(int[] array, int k){
        int current = 0;
        for (int i = 0; i < k; i++){
            current += array[i];
        }
        int result = current;
        for (int i = k; i < array.length; i++){
            current = current + array[i] - array[i-k];
            result = Math.max(result,current);
        }
        return result;
    }
}
