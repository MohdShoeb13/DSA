package com.dsa.arrays;

public class CheckSorted {
    public static void main(String[] args) {
        System.out.println(sorted(new int[]{11,22,33,44,0}));
    }

    static boolean sorted(int[] array){
        for (int i = 0; i < array.length - 1 ; i++){
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
}
