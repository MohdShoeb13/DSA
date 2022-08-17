package com.dsa.sort.algos;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,6};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
            int newElement = array[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];
            }
            array[i] = newElement;


        }

        System.out.println(Arrays.toString(array));
    }
}

