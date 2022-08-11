package com.dsa.search.algos;

import java.util.Arrays;

/**
 * This is variation of Insertion Sort Algorithm
 */

public class ShellSort {

    public static void main(String[] args) {

        int[] array = {1,8,7,6,5,3};

        for(int gap = array.length/2; gap > 0; gap/=2){

            for(int i = gap; i < array.length ; i++){
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement){
                    array[j] = array[j-gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }

        System.out.println(Arrays.toString(array));
    }


}
