package lrucache;

public class Main {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put(1,2);
        lruCache.put(3,4);
        lruCache.put(5,6);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache);
    }
}
