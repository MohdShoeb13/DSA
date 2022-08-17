package com.dsa.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        System.out.println(binarySearch(array,1));
        System.out.println(binarySearchRecursive(array,3));
    }

    public static int binarySearch(int[] array,int value){

        int start = 0;
        int end = array.length;

        while (start < end){
            int mid = (start+end)/2;
            if(array[mid] == value){
                return mid;
            }else if(array[mid] < value){
                start = mid + 1;
            }else {
                end = mid;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] array, int value){
        return binarySearchRecursive(array, 0, array.length, value);
    }

    public  static int binarySearchRecursive(int[] array, int start, int end, int value){
        if(start >= end){
            return -1;
        }

        int mid = (start+end)/2;

        if(array[mid] == value){
            return mid;
        }else if(array[mid] < value){
           return binarySearchRecursive(array,mid + 1,end,value);
        }else {
            return binarySearchRecursive(array,start,mid,value);
        }

    }
}
