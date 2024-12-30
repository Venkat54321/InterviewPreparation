package doublell;

public class CreateDoubleLinkedList {

    DNode head;
    DNode tail;
    public void add(int value){
        DNode newNode = new DNode(null,value,null);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print(){
        DNode tmp= head;
        while (tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println(" ");
    }

    public void remove(int k){
        DNode tmp = head;
        DNode tmp1 = tail;
        if(tmp.value == k){
            head = tmp.next;
            head.prev = null;
            return;
        }
        if(tmp1.value == k){
            tail = tmp1.prev;
            tail.next = null;
            return;
        }

        while (tmp != null){
            if(tmp.next.value == k){
                tmp.next = tmp.next.next;
                tmp = tmp.next.prev;
                break;
            }
            tmp = tmp.next;
        }
    }
}
