package com.dsa.adt;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {

        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public void addToFront(int data){
        Node node = new Node(data);
        node.setNext(head);
        if(head == null){
            tail = node;
        }else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public boolean addBefore(int existingData, int data){

        if(isEmpty()){
            return false;
        }

        Node current = head;
        while (current != null && !(current.getData() == existingData)){
            current = current.getNext();
        }

        if(current == null){
            return false;
        }

        Node newNode = new Node(data);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if(head == current){
            head = newNode;
        }else {
            newNode.getPrevious().setNext(newNode);
        }

        size++;

        return true;
    }



    public void addToLast(int data){
        Node node = new Node(data);
        if(tail == null){
            head = node;
        }else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public int removeFirst(){
        if(isEmpty()){
            return -1;
        }
        Node removedNode = head;

        if(head.getNext() == null){
            tail = null;
        }else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode.getData();

    }

    public int removeLast(){
        if(isEmpty()){
            return -1;
        }

        Node removeNode = tail;

        if(tail.getPrevious() == null){
            head =  null;
        } else  {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
        return removeNode.getData();
    }

    public boolean isEmpty(){
        return  size == 0;
    }

    public int size(){
        return size;
    }

    public void printList(){
       Node current = head;
        System.out.print("Head -> ");
        while (current != null){
            System.out.print(current.getData());
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
