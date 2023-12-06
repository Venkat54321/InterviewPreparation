package leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()[]{}";
       // String str = "(){}}{";
      //  boolean result = mySolution(str);
        boolean result = bestSolution(str);
        System.out.println(result);

    }

    private static boolean bestSolution(String str) {
        Stack<Character> stack = new Stack<>();
        if(str.length() ==1){
            return false;
        }
        Map<Character,Character>  map  = buildMap();
        stack.add(str.charAt(0));
        for(int i = 1;i<str.length();i++){
            if(!stack.isEmpty()){
                Character c0 = str.charAt(i);
                Character c1 = stack.peek();
                Character c2 = map.get(c1);
                if(c0 == c2){
                    stack.pop();
                }else {
                    stack.add(c0);
                }
            }else {
                stack.add(str.charAt(i));
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    private static boolean mySolution(String str){
        Map<Character,Character> map = buildMap();
        for(int i = str.length() - 1;i > 0;i--){
            Character originalChar = str.charAt(i);
            if(map.containsKey(originalChar)){
                Character c = map.get(originalChar);
                Character c2 = str.charAt(i-1);
                if(i > 0 && c != c2){
                    return false;
                }
            }
        }
        return true;
    }

    private static Map<Character,Character> buildMap(){
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        return map;
    }
}
