package com.dsa.challenges;

public class CountInversions {
    public static void main(String[] args) {
        int[] array = {40,30,20,10};
        int inversions = 0;
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j <  array.length; j++){
                if(array[i] > array[j]){
                    inversions++;
                }
            }
        }
        System.out.println(inversions);
    }
}
