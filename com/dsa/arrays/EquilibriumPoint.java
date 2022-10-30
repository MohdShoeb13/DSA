package com.dsa.arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
       int[] array = {4,2,2};
       System.out.println(efficientSolution(array));
    }

    static boolean hasEquilibriumPoint(int[] array){
        for (int i = 0; i < array.length; i++){
            int lSum = 0;
            int rSum = 0;

            for (int j = 0; j < i; j++){
                lSum += array[j];
            }

            for (int k = i + 1; k < array.length; k++){
                rSum += array[k];
            }

            if (lSum == rSum){
                return true;
            }
        }
        return false;
    }

    static boolean efficientSolution(int[] array){
        int result = 0;
        for (int i = 0 ; i < array.length; i++){
            result+= array[i];
        }
        int lSum = 0;
        for (int i = 0 ;i < array.length; i++){
            result -= array[i];
            if (result == lSum) return true;
            lSum += array[i];
        }
        return false;
    }
}
