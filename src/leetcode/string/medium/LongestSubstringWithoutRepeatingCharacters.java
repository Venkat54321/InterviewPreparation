package leetcode.string.medium;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "ABCBC";
        int longestSubStrLen = lswrc(str);
        System.out.println(longestSubStrLen);
    }

    private static int lswrc(String str) {
        if(str.length() == 0){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int max = 0;
        while (r <= str.length() -1 ){
            if(map.containsKey(str.charAt(r))){
                int index = map.get(str.charAt(r));
                if(index >= l){
                    l = index + 1;
                }
                map.put(str.charAt(r),r);
            }else{
                int len = r - l + 1;
                max = Math.max(len,max);
                map.put(str.charAt(r),r);
            }
            r++;
        }
        return max;
    }
}
