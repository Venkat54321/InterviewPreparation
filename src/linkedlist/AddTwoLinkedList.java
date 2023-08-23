package linkedlist;

public class AddTwoLinkedList {

    public static void main(String[] args) {
        Node head1 = CreateLinkedList.createLL();
        Node head2 = CreateLinkedList.createLL();

        Node head =  add(head1,head2);
        CreateLinkedList.displayLL(head);

    }

    private static Node add(Node head1, Node head2) {
        Node newLL = null;
        Node head = null;
        while (head1 != null && head2 != null){
            int v1 = head1.v;
            int v2 = head2.v;
            int sum = v1 + v2;
            Node ll = new Node(sum, null);
            if(newLL == null) {
                newLL = ll;
                head = newLL;
            }else {
                newLL.next = ll;
                newLL = ll;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head;
    }
}
