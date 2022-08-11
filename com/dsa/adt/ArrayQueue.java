package com.dsa.adt;

import java.util.NoSuchElementException;

public class ArrayQueue<T> {

    private T[] queue;
    private int front;
    private int back;


    public ArrayQueue(int capacity){
        queue = (T[])new Object[capacity];
    }

    public void add(T element){
        if(back == queue.length){
            T[] newQueue = (T[]) new Object[2 * queue.length];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }

        queue[back] = element;
        back++;
    }

    public T poll(){
        if(size() == 0) throw new NoSuchElementException();

        T removedElement = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0){
            front = 0;
            back = 0;
        }
        return removedElement;
    }


    public T peek(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size(){
        return back - front;
    }

    public void printQueue(){
        System.out.print("FRONT->");
        for(int i = front; i < back; i++){
            System.out.print("|" + queue[i]+"|-");
        }
        System.out.println(">BACK");
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.add(11);
        arrayQueue.add(12);
        arrayQueue.add(13);
        arrayQueue.add(14);
        arrayQueue.poll();
        System.out.println(arrayQueue.peek());

        arrayQueue.printQueue();

    }


}
