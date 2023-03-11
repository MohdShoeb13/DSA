package com.dsa;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,4,5,3,2};
        Main.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

   static void bubbleSort(int[] array){
        boolean swapped;
        for(int i = 0; i < array.length; i++){
            swapped = false;
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j+1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)break;
        }
   }



}

