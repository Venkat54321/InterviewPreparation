package doublell;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    int capacity;
    DNode head = new DNode(null,-1,null);;
    DNode tail = new DNode(null,-1,null);;
    Map<Integer,DNode> map = new HashMap<>();

    public LRUCache(int capacity){
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    public Integer get(int key){
        if(map.containsKey(key)){
            DNode node = map.get(key);
            remove(node.value);
            add(node.value);
            return node.value;
        }else {
            return -1;
        }
    }

    public void put(int key,int value){
        DNode newNode = new DNode(null,value,null);
        if(map.containsKey(key)){
            remove(value);
            add(value);
        }else if(map.size() == capacity){
            remove();
            add(value);
            map.put(key,newNode);
        }else {
            add(value);
            map.put(key,newNode);
        }
    }

    public void print(){
        DNode tmp = head;
        while (tmp != null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println(" ");
    }

    private void add(int value) {
        DNode newNode = new DNode(null,value,null);
        if(head.next == tail && tail.prev == head){
            head.next = newNode;
            newNode.prev = head;
            newNode.next = tail;
            tail.prev = newNode;
        }else {
            newNode.next = head.next;
            newNode.prev = head;
            head.next = newNode;
            newNode.next.prev = newNode;
        }
    }

    public void remove(){
        map.remove(tail.prev.value);
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
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
