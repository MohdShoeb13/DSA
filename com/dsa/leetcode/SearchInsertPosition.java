package com.dsa.leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(getPositionOrInsertPlace(new int[]{1,3,5,6},7));
    }

    static int getPositionOrInsertPlace(int[] array, int target){
        int low = 0, high = array.length-1;
        int mid = 0;

        while (low < high){
            mid = (low + high)/2;
            if(array[mid] == target){
                return mid;
            }else if (array[mid] < target){
                low = mid + 1;
            }else {
                high = mid;
            }
        }

        if(target < array[mid]){
            System.err.println(mid);
        }else if(target > array[array.length-1]){
            System.out.println(array.length);
        }else {
            System.out.println(mid+1);
        }
        return mid;
    }
}
