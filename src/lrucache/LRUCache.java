package lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private Node head =new Node(0,0);
    private Node tail = new Node(0,0);
    private int capacity;
    private Map<Integer,Node> hashMap = new HashMap<>();
    public LRUCache(int capacity){
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(hashMap.containsKey(key)){
            Node node = hashMap.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else {
            return -1;
        }
    }

    public void put(int key,int value){
        if(hashMap.containsKey(key)){
            remove(hashMap.get(key));
        }
        if(hashMap.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node){
        hashMap.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }
    private void insert(Node node){
        hashMap.put(node.key,node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

}

class Node{
    Node prev;
    Node next;
    int key;
    int value;
    public Node(int key,int value){
        this.key = key;
        this.value = value;
    }
}
