package com.dsa.arrays;

public class MinimumConsecutiveFlips {

    public static void main(String[] args) {
         int[] array = {0,1};
         minimumFlips(array);
    }

    static void minimumFlips(int[] array){
        int zeroGroup= 0;
        int oneGroup = 0;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] != array[i+1]){
                if(array[i] == 1){
                    oneGroup++;
                }else {
                    zeroGroup++;
                }
            }
        }
        if (array[array.length-1] == 0){
            zeroGroup++;
        }else {
            oneGroup++;
        }
        int res = 0;
        if(zeroGroup > oneGroup){
            res = 1;
        }

        for (int i = 0; i < array.length; i++){
            if(array[i] == res){
                System.out.println(i);
            }
        }
    }

    static void printGroups(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] != arr[i - 1])
            {
                if(arr[i] != arr[0])
                    System.out.print("From " + i + " to ");
                else
                    System.out.println(i - 1);
            }
        }

        if(arr[arr.length - 1] != arr[0])
            System.out.println(arr.length-1);
    }
}
