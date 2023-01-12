package com.dsa.search;

public class IndexOfFirstOccurrence {

    public static void main(String[] args) {
         int[] array = {15,15,15};
        System.out.println(indexOfFirstOccurrence(array,15));
    }

    static int indexOfFirstOccurrence(int[] array, int key){
        for (int i = 0; i  < array.length; i++){
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    static int indexOfFirstBinary(int[] array, int key){
        int low = 0, high = array.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if (array[mid] > key){
                high = mid - 1;
            } else if (array[mid] < key) {
                low = mid + 1;
            }else {
                if (mid == 0 || array[mid-1] != array[mid]){
                    return mid;
                }else {
                    high = mid -1;
                }
            }

        }
        return  -1;
    }
}
