package com.dsa.arrays;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
      int[] array = {3,1,3,3};
        System.out.println(efficientSolution(array,6));
    }

    static boolean subArrayHasSum(int[] array, int sum){
        for (int i = 0; i < array.length; i++){
            int current = 0;
            for (int j = i; j < array.length ;j ++){
                current += array[j];
                if (current == sum) return true;
            }
        }
        return false;
    }

    static boolean efficientSolution(int[] array, int sum){
        int start = 0, current = 0;
        for (int end = 0; end < array.length; end++){
            current += array[end];
            while (sum < current){
                current -= array[start];
                start++;
            }
            if (current == sum){
                return true;
            }
        }
        return false;
    }
}
