package com.dsa.leetcode;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        remDups(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int remDups(int arr[])
    {
        int res = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 3)
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
