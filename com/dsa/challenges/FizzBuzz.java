package com.dsa.challenges;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;

        List<String> fizzBuzz = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if (i%3==0 && i%5==0){
                fizzBuzz.add("FizzBuzz");
            }else if(i%3==0){
                fizzBuzz.add("Fizz");
            }else if(i%5 == 0){
                fizzBuzz.add("Buzz");
            }else {
                fizzBuzz.add(Integer.toString(i));
            }
        }

        System.out.println(fizzBuzz);
    }
}
