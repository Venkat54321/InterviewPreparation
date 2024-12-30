package leetcode.string.medium;

import java.util.Arrays;

public class LargeNumber {
    public static void main(String[] args) {
        int[] array = {3,30,34,5,9};
        String[] strArray = new String[array.length];
        for(int i=0;i<=array.length - 1;i++){
            strArray[i] = String.valueOf(array[i]);
        }
        Arrays.sort(strArray,(a, b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String s : strArray){
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
