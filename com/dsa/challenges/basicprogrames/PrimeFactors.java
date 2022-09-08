package com.dsa.challenges.basicprogrames;

public class PrimeFactors {
    public static void main(String[] args) {
        primeFactorsEfficient(8);
    }

    /**
     * Time Complexity O(n^2log(n))
     * @param number
     */
    static void primeFactors(int number){
        for(int i = 2; i < number; i++){
            if(Prime.isPrime(i)){
                int x = i;
                while (number % x == 0){
                    System.out.println(i);
                    x*=i;
                }
            }
        }
    }

    static void printPrimeFactors(int number){
        if(number <= 1) return;
        for (int i = 2; i * i <= number; i++){
            while (number % i == 0){
                System.out.println(i);
                number/= i;
            }
        }
        if (number > 1) System.out.println(number);
    }

    /**
     * Time Complexity O(_/n)
     * @param number
     */
    static void primeFactorsEfficient(int number){
        if (number <= 1) return;
        while (number % 2 == 0) {
            System.out.println(2);
            number/=2;
        }
        while (number % 3 == 0) {
            System.out.println(3);
            number/=3;
        }
        for (int i = 5; i * i <= number; i+=6){
            while (number % i == 0){
                System.out.println(i);
                number/=i;
            }
            while (number % (i+2) == 0){
                System.out.println(i+2);
                number/=(i+2);
            }
        }
        if (number > 3) System.out.println(number);
    }


}
