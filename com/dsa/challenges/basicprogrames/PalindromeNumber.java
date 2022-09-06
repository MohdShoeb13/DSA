package com.dsa.challenges.basicprogrames;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(9009));
    }

    static boolean isPalindromeNumber(int number){
        int copy = number;
        int reverse = 0;
        while (copy > 0){
            int remainder = copy%10;
            reverse = (reverse*10) + remainder;
            copy/=10;
        }
        return number == reverse;

    }
}
