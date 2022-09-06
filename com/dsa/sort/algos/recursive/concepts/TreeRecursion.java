package com.dsa.sort.algos.recursive.concepts;

public class TreeRecursion {
    public static void main(String[] args) {
          fun(3);
    }

    static void fun(int n){
        if(n > 0){
            System.out.print(n+" ");
            fun(n-1);
            fun(n-1);
        }
    }
}
