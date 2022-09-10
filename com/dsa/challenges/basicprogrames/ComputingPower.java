package com.dsa.challenges.basicprogrames;

public class ComputingPower {
    public static void main(String[] args) {
        System.out.println(powerIterative(5,0));
    }

    /**
     * Time Complexity 0(n)
     * @param number
     * @param raisedToThePower
     * @return
     */
    static int power(int number, int raisedToThePower){
        if (raisedToThePower == 0) return 1;
        int result = 1;
        for (int i = 1; i <= raisedToThePower; i++){
            result*=number;
        }
        return result;
    }

    /**
     * Time Complexity O(logn) Auxiliary space O(logn)
     * @param number
     * @param raisedToThePower
     * @return
     */
    static int powerRecursiveMethod(int number, int raisedToThePower){
        if (raisedToThePower == 0) return 1;
        int temp = powerRecursiveMethod(number,raisedToThePower/2);
        temp = temp * temp;
        return (raisedToThePower % 2 == 0) ? temp : temp * number;
    }

    /**
     * Time Complexity O(logn) Auxiliary space O(1)
     * @param x
     * @param n
     * @return
     */
    static int powerIterative(int x, int n){
        int res = 1;
        while (n > 0){
            if (n % 2 != 0) res = res * x;
            x = x * x;
            n = n >> 1;
        }
        return res;
    }
}
