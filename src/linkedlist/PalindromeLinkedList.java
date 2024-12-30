package linkedlist;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(2);
        myLinkedList.add(1);

        myLinkedList.print();
        boolean isPalindrome = myLinkedList.isPalindrome();
        System.out.println(isPalindrome);
    }
}
