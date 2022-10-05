package com.dsa.recursion;

public class PowerSet {
    public static void main(String[] args) {
        powerSet("abc",0,"");
    }

    static void powerSet(String word, int i, String current){
        if (i == word.length()){
            if (current.isEmpty()) System.out.println("{}");
            System.out.println(current);
            return;
        }
        powerSet(word,i+1,current+word.charAt(i));
        powerSet(word,i+1,current);
    }
}
