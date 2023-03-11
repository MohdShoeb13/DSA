package com.dsa.search;

public class TwoPointersApproach {

    public static void main(String[] args) {

        int[] array = {2,4,6,8,9};
        int target = 16;

        int i = 0, j = array.length-1;

        while (i < j){
            if(array[i] + array[j] == target){
                System.out.println(true);
                return;
            } else if (array[i] + array[j] < target) {
                i++;
            }else{
                j--;
            }
        }

        System.out.println(false);
    }
}
