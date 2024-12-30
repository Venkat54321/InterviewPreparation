package linkedlist;

public class RotateLL {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);


        myLinkedList.print();
        myLinkedList.rotate(3);
        myLinkedList.print();
    }
}
