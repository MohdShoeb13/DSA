package com.dsa.search;

public class TripletSum {

    public static void main(String[] args) {
      int[] array = {2,5,10,15,18};
        System.out.println(hasTriplets(array,33));
    }


    static boolean isTwoSum(int[] array, int target, int startIndex){
        int i = startIndex, j = array.length-1;
        while (i < j){
            if(array[i] + array[j] == target){
                return true;
            } else if (array[i] + array[j] < target) {
                i++;
            }else {
                j--;
            }
        }
        return false;
    }

    static boolean hasTriplets(int[] array, int target){
        for (int i = 0; i < array.length-2; i++){
            if(isTwoSum(array,target-array[i],i+1)){
                return true;
            }
        }
        return false;
    }
}
