package linkedlist;

import linkedlist.MyLinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);


        myLinkedList.print();
        myLinkedList.removeNthNodeFromEnd(1);
        myLinkedList.print();

    }
}
