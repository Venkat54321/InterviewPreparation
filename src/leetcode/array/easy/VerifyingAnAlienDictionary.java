package leetcode.array.easy;
import java.util.HashMap;
import  java.util.Map;
import java.util.Optional;

public class VerifyingAnAlienDictionary {

    public static void main(String[] args) {
        String[] words = {"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"};
        String order = "zkgwaverfimqxbnctdplsjyohu";
        Boolean isOrder = mySolution(words,order);
        System.out.println(isOrder);

    }

    private static Boolean mySolution(String[] words, String order) {
        if(words.length == 1){
            return true;
        }
        Map<Character,Integer> map = getWordsIndex(order);
        for(int i = 0;i < words.length - 1;i++) {
            String str1 = words[i];
            String str2 = words[i + 1];
            if (str1.equals(str2)) {
                continue;
            }
            if(!compare(str1,str2,map))
                return false;
        }
        return true;
    }

    private static boolean compare(String s1, String s2,Map<Character,Integer> map) {
        int l1 = s1.length(), l2 = s2.length();
        for (int i = 0, j = 0; i < l1 && j < l2; i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (map.get(s1.charAt(i)) > map.get(s2.charAt(j))) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        if (l1 > l2) return false;
        return true;
    }

    private static Map<Character, Integer> getWordsIndex(String order) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i< order.length();i++){
            map.put(order.charAt(i),i);
        }
        return map;
    }
}
