package com.dsa.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println( isPalindrome(s,0,s.length()-1));
    }

    public static boolean reverse(String str, int length,String reverse){
        if(length < 0) {
            return reverse.equals(str);
        }
        reverse+=str.charAt(length);
        return  reverse(str,length-1,reverse);
    }

    public static boolean isPalindrome(String str, int start,int end){
        if(start >= end){
            return true;
        }
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str,start+1,end-1);
    }
}

