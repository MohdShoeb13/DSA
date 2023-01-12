package com.dsa.search;

public class IndexOfLastOccurrence {

    public static void main(String[] args) {
      int[] arr = {1,2,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5};
      int  sol = lastOccurrenceIndex(arr,3);
        System.out.println(sol);
    }

    static int lastOccurrenceIndex(int[] array,int key){
        int low = 0, high = array.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(key > array[mid])
                low = mid + 1;

            else if(key < array[mid])
                high = mid - 1;

            else
            {
                if(mid == array.length - 1 || array[mid + 1] != array[mid])
                    return mid;

                else
                    low = mid + 1;
            }

        }

        return -1;
    }
}
