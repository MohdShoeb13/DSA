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


    public void addToCircularQueue(T element){
        if(size() == queue.length - 1){
            int numItems =  size();
            T[] newQueue = (T[]) new Object[2 * queue.length];
            System.arraycopy(queue,front,newQueue,0,queue.length-front);
            System.arraycopy(queue,0,newQueue,queue.length-front,back);
            queue = newQueue;
            front = 0;
            back = numItems;
        }

        queue[back] = element;
        if(back < queue.length -1){
            back++;
        }else {
            back = 0;
        }
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

    public T pollCircularQueue(){
        if(size() == 0) throw new NoSuchElementException();

        T removedElement = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0){
            front = 0;
            back = 0;
        }else if( front == queue.length){
            front = 0;
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
        if(front <= back) {
            return back - front;
        } else {
            return  back - front + queue.length;
        }

    }

    public void printQueue(){
        System.out.print("FRONT->");
        if(front <= back) {
            for(int i = front; i < back; i++){
                System.out.print("|" + queue[i]+"|-");
            }
        }else {
            for(int i = front; i < queue.length; i++){
                System.out.print("|" + queue[i]+"|-");
            }
            for(int i = 0; i < back; i++){
                System.out.print("|" + queue[i]+"|-");
            }
        }

        System.out.println(">BACK");
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(10);

        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.poll();
        arrayQueue.add(3);
        arrayQueue.poll();
        arrayQueue.add(4);
        arrayQueue.poll();
        arrayQueue.add(5);
        arrayQueue.poll();
        arrayQueue.add(6);

        arrayQueue.printQueue();

    }


}
