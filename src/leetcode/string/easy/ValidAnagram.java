package leetcode.string.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {
    public static void main(String[] args) {
       String s = "rat";
       String t = "cat";
       //boolean isAnagram =  mySolution(s,t);
       boolean isAnagram = bestSolution(s,t);
        System.out.println(isAnagram);
    }

    private static boolean bestSolution(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] array = new int[26];
        for(int i = 0;i< s.length();i++){
            array[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            array[t.charAt(i) - 'a']--;
        }
        for(int i: array){
            if(i !=0 ){
                return false;
            }
        }
        return true;
    }

    private static boolean mySolution(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i< s.length() - 1;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }else {
                map.put(s.charAt(i), 1);
            }
        }
        for(int i = 0;i<t.length() - 1;i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i)) - 1);
            }else {
                return false;
            }
        }
        if(map.containsValue(1)){
            return false;
        }{
            return true;
        }
    }
}
