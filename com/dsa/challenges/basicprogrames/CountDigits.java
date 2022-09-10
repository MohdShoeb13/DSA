package com.dsa.challenges.basicprogrames;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println(numberOfDigits(100));
    }

    public static int countDigits(int number){
        int counter = 0;
        int abs = Math.abs(number);
        while (abs > 0){
            abs/= 10;
            counter++;
        }
        return number == 0? 1: counter;
    }

    public static int numberOfDigits(int number){
        return (int) Math.floor(Math.log10(number)+1);
    }
}
