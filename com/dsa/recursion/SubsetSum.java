package com.dsa.recursion;

public class SubsetSum {
    public static void main(String[] args) {
        System.out.println(subs(new int[]{1,2,3},4,0,1,0));
    }

    static int subs(int[] array,int sum, int i , int j,int count){
        if (sum == 0){
            return 1;
        }
        if(j == array.length){
            return count;
        }

        int subSum = array[i] + array[j];
        if (subSum == sum){
            count++;
        }

        return subs(array,sum,i+1,j+1,count);

    }
}
