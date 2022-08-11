package com.dsa.adt;

import java.util.HashSet;

public class SinglyLinkedList {

    private Node head;
    private int size;


    private class Node {

        private int data;
        private Node next;

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
    }

    public void addToFront(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addToLast(int data) {
        if (isEmpty()) {
            addToFront(data);
            return;
        }
        Node current = head;
        Node node = new Node(data);
        while (current != null) {
            if (current.getNext() == null) {
                current.setNext(node);
                size++;
                return;
            }
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public int removeFirst() {
        if (isEmpty()) {
            return -1;
        }
        Node removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode.getData();
    }

    /**
     * @param data This method will add elements in Linked List in sorted order
     */
    public void insertSorted(int data) {

        if (head == null || head.getData() >= data) {
            addToFront(data);
            return;
        }

        Node current = head.getNext();
        Node previous = head;

        while (current != null && current.getData() < data) {
            previous = current;
            current = current.getNext();
        }
        Node newNode = new Node(data);
        newNode.setNext(current);
        previous.setNext(newNode);
        size++;
    }


    public static boolean detectLoop(Node head) {
        HashSet<Node> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) {
                return true;
            }
            hashSet.add(head);
            head = head.getNext();
        }
        return false;
    }


    public void printList() {
        Node current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.getData());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return this.size;
    }


    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.addToLast(22);
        ll.addToLast(23);
        ll.addToLast(25);
        ll.addToLast(26);
        ll.addToLast(30);

        ll.printList();

        /**
         * This line will create a loop to Linked List
         */
//        ll.head.next.next.next = ll.head;

        if (detectLoop(ll.head)) {
            System.err.println("Loop detected !!!");
        } else {
            System.out.println("No loop");
        }

    }
}
