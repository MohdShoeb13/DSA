package com.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        String romanNumber = "MCMXCIV";
        int integerValue = 0;

        for (int i = 0; i < romanNumber.length(); i++){
            if(i > 0 && map.get(romanNumber.charAt(i-1)) < map.get(romanNumber.charAt(i))) {
                integerValue += map.get(romanNumber.charAt(i)) - 2 * map.get(romanNumber.charAt(i - 1));
            }else {
                integerValue += map.get(romanNumber.charAt(i));
            }
        }
        System.out.println(integerValue);
    }
}
