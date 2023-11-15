package leetcode.array.medium;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main(String[] args) {
       // String[] array = {"eat","tea","tan","ate","nat","bat"};
       // String[] array = {"",""};
        String[] array = {""};
        
       // List<List<String>> list = mySolution(array);
        List<List<String>> list = bestSolution(array);
        System.out.println(list);
    }

    private static List<List<String>> bestSolution(String[] array) {
        Map<String,List> map = new HashMap<>();
        int[] count = new int[26];
        for(String s : array){
            Arrays.fill(count,0);
            System.out.println(s);
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i: count){
                sb.append("#");
                sb.append(i);
            }
            if(map.containsKey(sb.toString())){
                List<String> list1 = map.get(sb.toString());
                list1.add(s);
                map.put(sb.toString(),list1);
            }else {
                List<String> list2 = new ArrayList<>();
                list2.add(s);
                map.put(sb.toString(),list2);
            }
        }
        return new ArrayList(map.values());
    }

    private static List<List<String>> mySolution(String[] array) {
        List<List<String>> list = new ArrayList<>();
        if(array.length == 0){
            return list;
        }
        if(array.length == 1){
            List<String> list3 = new ArrayList<>();
            list3.add(array[0]);
            list.add(list3);
            return list;
        }
        Map<String,Integer> map = new HashMap<>();
        for(String i : array){
            char[] charArray = i.toCharArray();
            int sum = 0;
            for(int j = 0;j< charArray.length;j++){
                sum = sum + charArray[j];
            }
            map.put(i,sum);
        }
        Map<Integer,List<String>> listMap = new HashMap<>();
        for(String s : map.keySet()){
            Integer value = map.get(s);
            List<String> innerList;
            if(listMap.containsKey(value)){
                innerList = listMap.get(value);
            }else {
                innerList = new ArrayList<>();
            }
            innerList.add(s);
            listMap.put(value,innerList);
        }
        for(Integer s : listMap.keySet()){
            List<String> list1 = listMap.get(s);
            list.add(list1);
        }

        return list;
    }
}
