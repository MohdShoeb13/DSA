package com.dsa.arrays;

public class LargestElement {
    public static void main(String[] args) {
        largest(new int []{1,4,3,2,8,7,6,5,111,23});
    }

    static void largest(int[] array){
        int largest = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > largest) {
                largest = element;
            }
        }
        System.out.println("Largest is " + largest);

    }


}
