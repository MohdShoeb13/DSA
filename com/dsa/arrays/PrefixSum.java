package com.dsa.arrays;

public class PrefixSum {
    public static void main(String[] args) {
   int[] array = {1,2,3,4,5};
        System.out.println(getSumUsingPrefixSum(array,0,4));
    }

    static int getSum(int[] array, int start, int end){
        if(end >= array.length || start < 0) throw new ArrayIndexOutOfBoundsException();
        int sum = 0;
        for (int i = sum ;i <= end; i++){
            sum += array[i];
        }
        return sum;
    }

    static int getSumUsingPrefixSum(int[] array, int start, int end){
        int[] pSum = new int[array.length];
        pSum[0] = array[0];
        for (int i = 1; i < array.length;i++){
            pSum[i] = pSum[i-1] + array[i];
        }

        if (start == 0) return pSum[end];

        return pSum[end] - pSum[start-1];
    }
}
