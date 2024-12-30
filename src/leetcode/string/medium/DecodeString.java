package leetcode.string.medium;

import java.util.Objects;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
       String str = "998[leetcode]";
       String finalStr = decodeStr(str);
        System.out.println(finalStr);
    }

    private static String decodeStr(String str) {
        if(str.length() == 0){
            return "";
        }
        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for(int i = 0;i<= str.length() - 1;i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
              k = (k * 10) + (c - '0');
            }
            System.out.println(k);
           /* char c = str.charAt(i);
            if(c != ']') {
                if (Character.isDigit(c)) {
                    numStack.push(Integer.valueOf(String.valueOf(c)));
                } else
                    charStack.push(String.valueOf(c));
            }else{
                StringBuilder decodeString = new StringBuilder();
                String newStr = "";
                while (!Objects.equals(charStack.peek(), "[")){
                    newStr = charStack.pop() + "" + newStr;
                }
                charStack.pop();
                int num = numStack.pop();
                while (num > 0){
                    decodeString.append(newStr);
                    num--;
                }
                charStack.push(decodeString.toString());
            }*/
        }

        while (!charStack.isEmpty()){
            sb.insert(0,charStack.pop());
        }

        return sb.toString();
    }
}
