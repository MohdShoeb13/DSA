package com.dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
       int res =  removeDuplicatesNaive(new int[]{1,1,2,3,3,4,5});
        System.out.println(res);
    }

    static int removeDuplicatesNaive(int[] array){
        int[] temp = new int[array.length];
        temp[0] = array[0];
        int res = 1;
        for (int i = 1; i < array.length; i++){
            if(temp[res - 1] != array[i]){
                temp[res] = array[i];
                res++;
            }
        }
        if (res >= 0) System.arraycopy(temp, 0, array, 0, res);
        System.out.println(Arrays.toString(array));
        return res;
    }
}
