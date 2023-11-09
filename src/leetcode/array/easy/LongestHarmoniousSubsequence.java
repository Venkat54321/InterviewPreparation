package leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static void main(String[] args) {
        int[] array = {1,1,1,1};
        int res = mySolution(array);
        System.out.println(res);
    }

    private static int mySolution(int[] array) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : array) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                map.put(j, map.get(j) + 1);
            }
        }

        for(Integer i : map.keySet()){
            if(map.containsKey(i + 1)){
                res = Math.max(res,map.get(i) + map.get(i+1));
            }
        }
        return res;
    }
}
