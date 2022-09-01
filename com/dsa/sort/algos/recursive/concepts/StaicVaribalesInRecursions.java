package com.dsa.sort.algos.recursive.concepts;

public class StaicVaribalesInRecursions {

    /**
     * static variables will be shared across all the activation records
     */
    static int x;

    public static void main(String[] args) {
         int a = 5;
         System.out.println(fun(a));
        System.out.println(fun(a));
    }

    static int fun(int n){
        if(n > 0){
            x++;
            return fun(n-1) + x;
        }
        return 0;
    }
}
