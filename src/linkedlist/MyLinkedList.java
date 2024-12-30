package linkedlist;

public class MyLinkedList {
    Node head = null;
    Node tail = null;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node tmp = head;

        while (tmp != null) {
            System.out.print(tmp.value + "  ");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    public void reverse(){
        Node prevoisNode = null;
        Node currentNode = head;
        while (currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevoisNode;
            prevoisNode = currentNode;
            currentNode = nextNode;
        }
        head = prevoisNode;
    }

    public void delete(int key){
        Node previous = head;
        Node current = head;
        while (current != null){
            if(current.value == key){
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }

    public void removeDuplicateFromSortedList(){


    }

    public MyLinkedList add(MyLinkedList list1,MyLinkedList list2){
        list1.print();
        list2.print();
        Node l1 = list1.head;
        Node l2 = list2.head;
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry !=0){

            int digit1 = (l1 != null) ? l1.value : 0;
            int digit2 = (l2 != null) ? l2.value : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            Node newNode= new Node(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        Node result = dummyNode.next;
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = result;
        return myLinkedList;
    }

    public void removeNthNodeFromEnd(int k){
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (count < k+1){
            fast = fast.next;
            count++;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }

    public void removeMiddleElement(){
        Node prev = new Node(0);
        prev.next = head;
        Node slow = prev;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
    }

    public boolean isPalindrome(){
        // middle
        Node prev = new Node(0);
        prev.next = head;
        Node slow = prev;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse second half
        Node prevoisNode = null;
        Node currentNode = slow;
        while (currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevoisNode;
            prevoisNode = currentNode;
            currentNode = nextNode;
        }
        // compare first half and second half
        Node secondHalf = prevoisNode;
        Node firstHalf = head;
        while (secondHalf != null && firstHalf != null){
            if(firstHalf.value != secondHalf.value){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public boolean isCycleFound(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.value == fast.value){
                return true;
            }
        }
        return false;
    }

    public void rotate(int k){

    }

}

