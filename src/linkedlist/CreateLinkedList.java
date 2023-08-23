package linkedlist;

public class CreateLinkedList {

    public static void main(String[] args) {
       Node head = createLL();
        displayLL(head);
    }

    public static void displayLL(Node head) {
        while (head != null){
            System.out.println(head.v);
            head = head.next;
        }
    }

    public static Node createLL() {
        Node n5 = new Node(5,null);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        return n1;
    }
}
