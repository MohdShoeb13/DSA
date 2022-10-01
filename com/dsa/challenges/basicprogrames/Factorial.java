package com.dsa.challenges.basicprogrames;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));
//        System.out.println(factorialRecursive(12));
    }

    static long factorial(int number){
       long factorial = 1;
        for(long i = number; i > 0; i--){
            factorial*=i;
        }
        return factorial;
    }

    static BigInteger factorialBig(int number){
        BigInteger factorial = new BigInteger("1");
        for(long i = number; i > 0; i--){
            factorial = BigInteger.valueOf(i).multiply(factorial);
        }
        return factorial;
    }

    static int factorialRecursive(int number){
        if(number == 0){
            return 1;
        }
        return number * factorialRecursive(number -1);
    }
}
