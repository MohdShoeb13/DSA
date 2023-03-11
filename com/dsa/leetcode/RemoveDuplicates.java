package com.dsa.leetcode;

import com.dsa.arrays.MoveZeroesToEnd;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] sortedArray = {1,2,2,2,3,3,4,5,6};

        int insertIndex = 1;

        for(int i = 1; i < sortedArray.length; i++){
            if(sortedArray[i-1] != sortedArray[i]){
                sortedArray[insertIndex] = sortedArray[i];
                insertIndex++;
            }
        }

        System.out.println(Arrays.toString(sortedArray));
    }

}
