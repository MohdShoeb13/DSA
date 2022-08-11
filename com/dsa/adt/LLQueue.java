package com.dsa.adt;

import java.util.LinkedList;

public class LLQueue<T> {

    private LinkedList<T> queue;


    public LLQueue() {
        queue = new LinkedList<>();
    }

    public void add(T element){
        queue.add(element);
    }

    public T poll(){
        return queue.removeFirst();
    }

    public  T peek(){
        return queue.getFirst();
    }

    public void printQueue(){
        System.out.print("FRONT->");
        for(T item :  queue){
            System.out.print("|"+item+"|-");
        }
        System.out.println(">BACK");
    }


    public static void main(String[] args) {
        LLQueue<Integer> llQueue = new LLQueue<>();
        llQueue.add(1);
        llQueue.add(2);
        llQueue.add(3);
//        llQueue.poll();
        llQueue.printQueue();
//        System.out.println(llQueue.peek());
    }

}
