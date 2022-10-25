package com.dsa.arrays;

public class MajorityElement {
    public static void main(String[] args) {
      int[] array = {1,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3};
        System.out.println(majorityElement(array));
    }

    static int majorityElement(int[] array){

        for(int i = 0; i < array.length; i++){
            int count = 1;
            for(int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count > array.length/2){
                return i;
            }
        }
        return -1;
    }

    static int findMajority(int arr[], int n)
    {
        int res = 0, count = 1;

        for(int i = 1; i < n; i++)
        {
            if(arr[res] == arr[i])
                count++;
            else
                count --;

            if(count == 0)
            {
                res = i; count = 1;
            }
        }

        count = 0;

        for(int i = 0; i < n; i++)
            if(arr[res] == arr[i])
                count++;

        if(count <= n /2)
            res = -1;

        return res;
    }
}
