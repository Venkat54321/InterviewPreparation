package leetcode.string.medium;

import java.util.Stack;


public class ReverseSubstringsBetweenEachPairOfParentheses {
    public static void main(String[] args) {
        String str = "(u(love)i)";
        String finalStr = getSubStr(str);
        System.out.println(finalStr);
    }

    private static String getSubStr(String str) {
        Stack<Integer> stack = new Stack<>();
        String finalStr = "";
        Integer startBracket =0;
        for(int i = str.length() - 1; i >=0;i--){
            if(str.charAt(i) == ')'){
                stack.push(i);
            }else if(str.charAt(i) == '('){
                int top = stack.pop();
                startBracket = i;
                String newStr = reverseStrI(str,i+ 1, top - 1);
                System.out.println(newStr);
            }
        }
        return finalStr;
    }

    private static String reverseStrI(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        while (start <= end){
            sb.append(str.charAt(end));
            end--;
        }
        return sb.toString();
    }
}
