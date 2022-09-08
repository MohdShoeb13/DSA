package com.dsa.challenges.basicprogrames;

public class Divisors {

    public static void main(String[] args) {
         printDivisors(7);
    }

    static void printDivisors(int number){
        for (int i = 1; i <= number; i++){
            if(number%i == 0){
                System.out.println(i);
            }
        }
    }

    /**
     * Time Complexity O(_/n)
     * @param number
     */
    static void divisors(int number){
        int i;
        /**
         * Print all divisors from 1(inclusive) to _/n(exclusive)
         */
        for (i = 1; i * i < number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }

        /**
         * Print all divisors from _/n(inclusive) to n(exclusive)
         */
         for (; i >= i;i--){
            if(number % i == 0){
                System.out.println(number/i);
            }
        }
    }
}
