package leetcode.array.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] array = {"club","clutch","clumsy"};
        String longestCommonPrefix = lcpMethod2(array);
        System.out.println(longestCommonPrefix);
    }

    private static String lcpMethod2(String[] array) {
        if(array.length == 0){
            return "";
        }
        if(array.length == 1){
            return array[0];
        }
        Arrays.sort(array);
        char[] charArray1 = array[0].toCharArray();
        char[] charArray2 = array[array.length - 1].toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i <= charArray1.length - 1 && j <= charArray2.length - 1){
            if(charArray1[i] != charArray2[j]){
                return sb.toString();
            }
            sb.append(charArray1[i]);
            i++;
            j++;
        }
        return sb.toString();

    }

    private static String lcpMethod1(String[] array) {
        if(array.length == 0){
            return "";
        }
        if(array.length == 1){
            return array[0];
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = array[0].toCharArray();
        int i = 1;
        int j = 0;
        while (j < charArray.length){
            for(;i <= array.length - 1;i++){
                char c = array[i].length() > j ? array[i].charAt(j) : ' ';
                if(charArray[j] != c){
                    return sb.toString();
                }
            }
            sb.append(charArray[j]);
            i = 1;
            j++;
        }
        return sb.toString();
    }
}
