package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {2, 1, 2};
        System.out.println(secondLargestAndLargest(array));
    }

    static ArrayList<Integer> secondLargestAndLargest(int[] array){
        int largest = 0;
        int result = -1;

        for (int i = 1; i < array.length; i++){
            if(array[i] > array[largest]){
                result = largest;
                largest = i;
            }else if(array[i] != array[largest]){
                if(result == -1 || array[i] > array[result]){
                    result = i;
                }
            }
        }

       ArrayList<Integer> solution = new ArrayList<>();
        solution.add(array[largest]);
        solution.add(array[result]);
        return solution;
    }
}




