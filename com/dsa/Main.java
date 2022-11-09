package com.dsa;

import com.dsa.adt.DoublyLinkedList;
import com.dsa.adt.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

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
