package com.dsa.sort.algos;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {1,2,7,4,5,3,6};

//        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
//            int newElement = array[firstUnsortedIndex];
//            int i;
//
//            for(i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--){
//                array[i] = array[i-1];
//            }
//            array[i] = newElement;
//
//        }
           GFGInsertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void GFGInsertionSort(int[] array){
       for(int i = 1; i < array.length;i++){
           int key = array[i];
           int j = i - 1;
           while (j >= 0 && array[j] > key){
               array[j+1] = array[j];
               j--;
           }
           array[j+1] = key;
       }
    }
}

