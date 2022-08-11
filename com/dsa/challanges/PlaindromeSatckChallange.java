package com.dsa.challanges;

import com.dsa.adt.LLStack;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class PlaindromeSatckChallange {

    public static void main(String[] args) {

        String sentence = "I did, did I?";

        System.out.println(isPalindrome(sentence));


    }

    public static boolean isPalindrome(String sentence){
        String processed = sentence.toLowerCase(Locale.forLanguageTag(sentence)).replaceAll("[^a-z]","");
        LLStack<Character> stack = new LLStack<>();
        for(int i = 0; i < processed.length(); i++){
            stack.push(processed.charAt(i));
        }

        for(int i = 0 ;i < processed.length(); i++){
            if(processed.charAt(i) != stack.pop()) return false;
        }

        return true;
    }
}
