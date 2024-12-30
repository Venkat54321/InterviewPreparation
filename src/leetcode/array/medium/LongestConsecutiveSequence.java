package leetcode.array.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] array = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        int longestConsecutiveSequence = longestConsecutiveSequence(array);
        System.out.println(longestConsecutiveSequence);
    }

    private static int longestConsecutiveSequence(int[] array) {
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return 1;
        }
        Map<Integer,Integer> hashSet = new HashMap();
        int min = array[0];
        for(int i = 0;i <= array.length - 1;i++){
            if(array[i] < min){
                min = array[i];
            }
            hashSet.put(array[i],0);
        }

        int lcs = 1;
        int maxSoFar = 1;
        int k = array.length - 1;
        while ( k >=0 ){
            if(hashSet.containsKey(min + 1)){
                lcs++;
            }else{
                if(lcs > maxSoFar){
                    maxSoFar = lcs;
                    lcs = 0;
                }
            }
            min++;
            k--;
        }

        return Math.max(maxSoFar,lcs);
    }
}
