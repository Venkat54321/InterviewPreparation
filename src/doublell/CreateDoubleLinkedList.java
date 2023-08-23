package doublell;

public class CreateDoubleLinkedList {

   static DNode head,tail = null;
    public static void main(String[] args) {
        CreateDoubleLinkedList dll = new CreateDoubleLinkedList();
        dll.createDLL(1);
        dll.createDLL(2);
        dll.createDLL(3);
        dll.createDLL(4);
        dll.displayDLL(head);

    }

    public  void displayDLL(DNode node) {
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }

    }

    public void createDLL(Integer value) {
        DNode node = new DNode(null,value,null);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }
    }
}
