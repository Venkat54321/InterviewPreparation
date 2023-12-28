package leetcode.string.easy;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 5;
        List<String> list = mySolution(n);
        System.out.println(list);
    }

    private static List<String> mySolution(int n) {
        List<String> list = new ArrayList<>();
        List<Integer> divisors = Arrays.asList(3,5);
        Map<Integer,String> map = buildMap();
        for(int i = 1;i<= n;i++){
            StringBuilder sb = new StringBuilder("");
            for(Integer div : divisors){
                if(i%div == 0){
                    sb.append(map.get(div));
                }
            }
            if(sb.toString().equals("")) {
                list.add(String.valueOf(i));
            }else {
                list.add(sb.toString());
            }
        }
        return list;
    }

    private static Map<Integer,String> buildMap(){
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"Fizz");
        map.put(5,"Buzz");
        return map;
    }
}
