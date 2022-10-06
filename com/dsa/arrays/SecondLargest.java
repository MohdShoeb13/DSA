package com.dsa.arrays;

public class SecondLargest {
    public static void main(String[] args) {
       secondLargest(new int[] {1,2,3,4,5,6,654,123,444,33,123,789,789});
    }

    static void secondLargest(int[] array){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;
        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            }
        }
        System.out.println(secondLargest);
    }
}
