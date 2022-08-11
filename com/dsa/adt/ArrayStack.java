package com.dsa.adt;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayStack<T> {

    private T[] array;
    private int top;

    public ArrayStack(){
        this.array = (T[])new Object[10];
    }

    public void push(T element){
        if(isStackFull()) throw new StackOverflowError("Array Stack is full");
        array[top++] = element;
    }

    public T pop(){
        if(isStackEmpty()) throw new EmptyStackException();
        top--;
        T removedData = array[top];
        array[top] = null;
        return  removedData;
    }

    public T peek(){
        if(isStackEmpty()) throw  new EmptyStackException();
        return array[top-1];
    }

    public boolean isStackFull(){
        return  top  == array.length;
    }

    public boolean isStackEmpty(){
        return top == 0;
    }

    public void printStack(){

        for(int i = top - 1; i >= 0; i--){
            System.out.println("|___"+array[i]+"___|");
        }

        System.out.println(Arrays.toString(array));
        System.out.println(top);
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(99);
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();


        System.out.println(stack.peek());
        stack.printStack();
    }
}
