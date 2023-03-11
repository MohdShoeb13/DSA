package com.dsa.sort.algos;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {5,6,4,3,2,7};

//        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
//            int largest = 0;
//            for(int i = 1; i <= lastUnsortedIndex; i++){
//                if(array[i] > array[largest]){
//                    largest = i;
//                }
//            }
//            swap(array,largest,lastUnsortedIndex);
//        }
        GFGSelectionSort(array);

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

    static void GFGSelectionSort(int[] array){

        for(int i = 0; i < array.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
