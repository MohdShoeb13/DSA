package com.dsa.search.algos;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5,6,4,3,2,7};

        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(array[i] > array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }


    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j]  = temp;
    }
}
