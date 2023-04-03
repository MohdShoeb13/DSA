package com.dsa.challenges;

import java.util.Arrays;

public class RunnigSum {
    public static void main(String[] args) {
        int[] array = {3,1,2,10,1};
        int sum = 0;
        for(int i = 0; i < array.length; i++ ){
            array[i] = array[i] + sum;
            sum = array[i];
        }

        System.out.println(Arrays.toString(array));
    }
}
