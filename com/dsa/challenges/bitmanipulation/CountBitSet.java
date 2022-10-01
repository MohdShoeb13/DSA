package com.dsa.challenges.bitmanipulation;

public class CountBitSet {
    public static void main(String[] args) {

    }

    static int countSet(int number){
        int result = 0;

        while (number > 0){
            if(number%2 != 0) // result = result + (number & 1);
                result++;
            number/=2; // number = number >> 1
        }
       return result;
    }

    static int brainKerningamAlgorithm(int number){
        int result = 0;
        while(number > 0){
            number = (number & (number-1));
            result++;
        }
        return result;
    }

}

class CountSetLookupTable {
    static int []table = new int[256];

    // recursive function to count set bits
    public static void initialize() {

        // To initially generate the table algorithmically:
        table[0] = 0;
        for (int i = 0; i < 256; i++)
        {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    public static int countSetBits(int n)
    {
        return  table[n & 0xff] +
                table[(n >> 8) & 0xff] +
                table[(n >> 16) & 0xff] +
                table[n >> 24];
    }

    // Driver function
    public static void main(String[] args) {
        initialize();
        int n = 9;
        System.out.println(countSetBits(n));
    }

}
