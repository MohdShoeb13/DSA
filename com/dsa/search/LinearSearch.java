package com.dsa.search;

public class LinearSearch {

    public static void main(String[] args) {
         int[] array = {1,2,3,4,5,6,70};

        System.out.println(linearSearch(array,70));
    }

    public static int linearSearch(int[] array, int element){

        for (int i = 0; i < array.length; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }
}
