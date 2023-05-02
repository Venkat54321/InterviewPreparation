package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<>();
        maps.put("1","2");
        maps.put("3","4");
        maps.put("1","new 2");

        System.out.print(maps);
    }
}
