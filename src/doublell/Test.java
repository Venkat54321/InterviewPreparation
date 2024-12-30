package doublell;

public class Test {
    public static void main(String[] args) {
        CreateDoubleLinkedList doubleLinkedList = new CreateDoubleLinkedList();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);
        doubleLinkedList.add(5);
        doubleLinkedList.add(6);
        doubleLinkedList.add(7);
        doubleLinkedList.add(8);
        doubleLinkedList.add(9);
        doubleLinkedList.print();
        doubleLinkedList.remove(5);
        doubleLinkedList.print();
    }
}
