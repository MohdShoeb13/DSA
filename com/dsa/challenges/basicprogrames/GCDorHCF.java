package com.dsa.challenges.basicprogrames;

public class GCDorHCF {

    public static void main(String[] args) {
        System.out.println(gcdEuclidOptimized(656,456));
    }


    /**
     *
     * @param first smaller of the number
     * @param second larger of the number
     * @return Greatest Common Factor ot HCF
     */
    static int getGCD(int first, int second){
        int gcd = 0;
        int number = 1;
        while (number < Math.min(first,second)){
            if( (first%number) == 0 && (second%number) == 0){
                gcd = number;
            }
            number++;
        }
        return gcd;
    }

    /**
     *
     * @param first
     * @param second
     * @return gcd
     * Time Taken O(min(first,second))
     */
    static int gcd(int first, int second){
        int gcd = Math.min(first,second);
        while (gcd > 0){
            if(first % gcd == 0 && second % gcd == 0){
                break;
            }
            gcd--;
        }
        return gcd;
    }

    static int gcdEuclid(int a, int b){

        while (a != b){
            if(a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }

    static int gcdEuclidOptimized(int a, int b){
        if (b == 0){
            return a;
        }
        return gcdEuclidOptimized(b, a % b);
    }
}
