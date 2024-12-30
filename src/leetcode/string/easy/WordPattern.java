package leetcode.string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern = "abba";
        boolean isWordPattern = isWordPattern(pattern,s);
        System.out.println(isWordPattern);
    }

    private static boolean isWordPattern(String pattern, String s) {
        if(pattern.isEmpty()){
            return true;
        }
        Set<String> sSet = new HashSet<>();
        Set<Character> pSet = new HashSet<>();
        Map<Character,String> map = new HashMap<>();
        String[] sList = s.split(" ");
        for(int i = 0; i <= sList.length - 1;i++){
            pSet.add(s.charAt(i));
            sSet.add(sList[i]);
        }
        return sSet.size() == pSet.size();
    }
}
