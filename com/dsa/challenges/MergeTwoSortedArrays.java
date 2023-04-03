package com.dsa.challenges;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] a1 = {1,2,3,0,0,0};
        int [] a2 = {2,5,6};

        int[] merged = mergeSortedArraysLeetCode(a1,3,a2,3);

        System.out.println(Arrays.toString(merged));
    }

    static int[] mergeSortedArraysLeetCode(int[] nums1, int m, int[] nums2 , int n){

        int i = m - 1, j = n - 1, k = m + n -1;

        while (j >= 0){
            if(i >=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else {
                nums1[k--] = nums2[j--];
            }
        }

        return nums1;
    }

    static int[] mergeSortedArrays(int[] a, int[] b){
        int i = 0, j = 0, k=0;
        int[] mergedArray = new int[a.length + b.length];
        while (i < a.length && j < b.length){
            if(a[i] <= b[j]){
                mergedArray[k++] = a[i++];
            }else{
                mergedArray[k++] = b[j++];
            }
        }
        while (i < a.length){
            mergedArray[k++] = a[i++];
        }
        while (j < b.length){
            mergedArray[k++] = b[j++];
        }
        return mergedArray;
    }
}
