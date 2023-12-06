package leetcode.string.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] array = {"flower","flow","flight"};
      //  String[] array = {"cluster","clu","clutch","club","clumsy"};
        Arrays.sort(array);
       for(String s : array){
           System.out.println(s);
       }
       // String[] array = {"a","ab","ac"};
        //String result = mySolution(array);
       // System.out.println(result);

    }

    private static String mySolution(String[] array) {
        StringBuilder sb = new StringBuilder("");
        int counter = 0;
        int i = 0;
        int len = array[0].length();
        while (i <= len){
            Character c = null;
            if(i < array[0].length() && i <= counter) {
                c = array[0].charAt(counter);
            }
            int allCount =1;
             for(int j = 1;j< array.length;j++){
                 if(c != null && counter <= array[j].length() && array[j].charAt(counter) == c){
                        allCount++;
                }
            }
             if(allCount == array.length){
                 sb.append(c);
                 counter++;
                 i++;
             }else {
                 return sb.toString();

             }
        }
        return "";
    }
}
