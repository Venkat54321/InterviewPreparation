package linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
       Node head = CreateLinkedList.createLL();
       Node node = reverseLL(head);
       CreateLinkedList.displayLL(node);
    }

    public static Node reverseLL(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
