package com.dsa.arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int [] array = {1,0,2,0,3,0,4,0};
        moveZeroesEfficient(array);
    }


    /**
     * Naive approach O(n^2)
     * @param array
     */
    static void moveZeroes(int[] array)
    {
      for (int i = 0; i < array.length; i++){
          if(array[i] == 0){
              for (int j = i+1; j < array.length; j++){
                  if(array[j] != 0){
                      int temp = array[i];
                      array[i] = array[j];
                      array[j] = temp;
                      break;
                  }
              }
          }
      }
        System.out.println(Arrays.toString(array));
    }

    static void moveZeroesEfficient(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] != 0){
                int temp = array[i];
                array[i] = array[count];
                array[count] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
