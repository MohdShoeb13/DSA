package com.dsa.leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 10;
        int copy = number;
        int reverse = 0;
        while (copy != 0){
            int remainder = copy % 10;
            reverse = reverse * 10 + remainder;
            copy/=10;
        }
        System.out.println(reverse);
    }
}
