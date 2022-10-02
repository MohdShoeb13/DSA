package com.dsa.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(123));
    }

    public static int digitSum(int number){
        if(number == 0) return  number;
        return digitSum(number/10) + number%10;
    }
}
