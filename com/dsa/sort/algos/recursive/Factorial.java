package com.dsa.sort.algos.recursive;

import java.util.Arrays;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorialRecursive(1));
        Arrays.sort(new int[]{1,2,3,4,5,6});
    }

    public static int factorial(int number){
        int factorial = 1;

        if(number <= 1 ){
            return 1;
        }

        for(int i = number; i > 0; i--){
            factorial*=i;
        }

        return factorial;
    }

    public static int factorialRecursive(int number) {
        if(number <= 1){
            return 1;
        }

        return number * factorial(number -1);
    }
}
