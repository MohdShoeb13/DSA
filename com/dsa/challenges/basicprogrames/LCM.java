package com.dsa.challenges.basicprogrames;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcmEfficient(256,234));
    }

    /**
     *
     * @param a
     * @param b
     * @return lcm
     * This is naive approach
     */
    static int lcm(int a, int b){
        int lcm = Math.max(a, b);
        while (true){
            if(lcm%a == 0 && lcm%b == 0){
                return lcm;
            }
            lcm++;
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return lcm
     *  a * b = lcm(a,b) * gcd(a,b)
     *  Time complexity O(log(min(a,b)))
     */
    static int lcmEfficient(int a, int b){
        int gcd = GCDorHCF.gcdEuclidOptimized(a, b);
        return (a*b)/gcd;
    }
}
