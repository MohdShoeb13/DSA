package com.dsa.challenges;

public class NumberofstepsTo {

    public static void main(String[] args) {
        int steps = 0;
        int number = 123;

        while (number > 0){
            if((number & 1) == 0){
                number /= 2;
            }else {
                number -= 1;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
