package com.dsa.arrays;

public class MaxLengthEvenOddArray {
    public static void main(String[] args) {
        System.out.println(maxLength(new int[]{1,3,7,9,11,12,13,14}));
    }

    static int maxLength(int[] array){
        int maxLength = 1;
        int current = 0;
        for(int i = 0; i < array.length-1; i++){
            if((array[i] % 2 == 0 && array[i+1] % 2 != 0) || (array[i] % 2 != 0 && array[i+1] % 2 == 0)){
                maxLength++;
            }else {
                current = Math.max(current,maxLength);
                maxLength = 1;
            }
        }
        return maxLength;
    }

    static int maxEvenOdd(int arr[], int n)
    {
        int res = 1;
        int curr = 1;

        for(int i = 1; i < n; i++)
        {
            if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)
                    ||(arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
            {
                curr++;

                res = Math.max(res, curr);
            }
            else
                curr = 1;
        }

        return res;
    }
}
