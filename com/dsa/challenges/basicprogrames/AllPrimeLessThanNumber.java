package com.dsa.challenges.basicprogrames;

import java.util.Arrays;
import java.util.stream.Stream;

public class AllPrimeLessThanNumber {
    public static void main(String[] args) {
        sieveCompressed(13);
    }

    /**
     * Time Complexity O(n_/n)
     * @param number
     */
    static void primes(int number){
        for (int i = 2; i <= number; i++){
            if(Prime.isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static void sieve(int number){
        boolean[] isPrime = new boolean[number+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= number; i++){
            if(isPrime[i]){
                for (int j = 2 * i; j <= number; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= number; i++){
            if (isPrime[i]){
                System.out.println(i);
            }
        }
    }

    /**
     * Time Complexity O(nlog(log(n)))
     * @param number
     */
    static void sieveCompressed(int number){
        boolean[] isPrime = new boolean[number+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= number; i++){
            if(isPrime[i]){
                System.out.println(i);
                for (int j = i * i; j <= number; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }

}
