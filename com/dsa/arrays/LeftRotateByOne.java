package com.dsa.arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        leftRotateByn(new int[]{1,2,3},3);
    }

    static void leftRotate(int[] array){
        int first = array[0];
        for (int i = 0; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = first;
        System.out.println(Arrays.toString(array));
    }

    static void leftRotateByn(int[] array, int n){
        for (int i = 0; i < n; i++) leftRotate(array);
    }

    /**
     * reversal and efficient method
     */

    static void leftRotate(int arr[], int d, int n)
    {
        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);

    }

    static void reverse(int arr[], int low, int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

}


