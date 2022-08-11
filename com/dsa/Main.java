package com.dsa;

import com.dsa.adt.DoublyLinkedList;
import com.dsa.adt.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

           SinglyLinkedList list = new SinglyLinkedList();

           list.insertSorted(5);
           list.insertSorted(2);
           list.insertSorted(1);
           list.insertSorted(3);
           list.insertSorted(4);

           list.printList();



    }
}
