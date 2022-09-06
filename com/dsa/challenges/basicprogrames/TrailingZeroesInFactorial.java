package com.dsa.challenges.basicprogrames;

import java.math.BigInteger;

class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        System.out.println(getTrailingZeroesEfficient(100));
    }

    /**
     *
     * @param number
     * @return trailing zeroes
     * This is a naive approach which gives O(n) complexity
     * and has overflow issues even with slightly large numbers
     */
    static int getTrailingZeroes(int number){
        long factorial = Factorial.factorial(number);
        int trailingZeroes = 0;
        while (factorial % 10 == 0){
           trailingZeroes++;
           factorial/=10;
        }
        return trailingZeroes;
    }

    /**
     *
     * @param number
     * @return trailing zeroes in factorial of a number
     * Efficient approach which gives O(log(n)) complexity
     */
  static int getTrailingZeroesEfficient(int number){
        int result = 0;
        for(int i = 5; i <= number; i = i * 5){
            result+=(number/i);
        }
        return result;
  }
}
