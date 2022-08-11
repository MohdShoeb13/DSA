package com.dsa.adt;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LLStack<T> {

    private LinkedList<T>  stack;

    public LLStack(){
        this.stack = new LinkedList<>();
    }


    public boolean isStackEmpty(){
        return stack.isEmpty();
    }

    public T pop(){
        if (isStackEmpty()) throw new EmptyStackException();
        return stack.removeLast();
    }

    public void push(T element){
        stack.addLast(element);
    }

    public T peek(){
        if(isStackEmpty()) throw new EmptyStackException();
        return stack.getLast();
    }

    public void printStack(){
        for(int i = stack.size() - 1; i >=0 ; i--){
                System.out.println("|___"+stack.get(i)+"___|");
        }
    }

    public static void main(String[] args) {
        LLStack<Integer> stack = new LLStack<>();
        stack.push(new Integer(11));
//        stack.push(12);
//        stack.push(13);
//        stack.push(24);
        stack.pop();
        System.out.println(stack.peek());
        stack.printStack();
    }

}
