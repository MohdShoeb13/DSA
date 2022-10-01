package com.dsa.challenges.bitmanipulation;

public class KthBitSet {

    public static void main(String[] args) {
        kthBit(1,2);
    }

    static void kthBit(int number, int bitPosition){
        if(((number >> (bitPosition -1))&1) == 1){
            System.out.println("Yes");
        }else {
            System.err.println("No");
        }
    }
}
