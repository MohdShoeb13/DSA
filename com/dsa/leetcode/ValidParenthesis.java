package com.dsa.leetcode;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String parans = "{(})";
        Stack<Character> stack = new Stack<>();

        for (char c : parans.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c){
                System.out.println(false);
                return;
            }

        }
        System.out.println(stack.isEmpty());
    }


}
