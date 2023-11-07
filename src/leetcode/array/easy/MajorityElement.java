package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] array = {2,2,1,1,1,2,2,2,2};
       // int[] array = {3,2,3};
       // int majorityElement = worstSolution(array);
        int majorityElement = bestSolutionOne(array);
        System.out.println(majorityElement);
    }

    private static int bestSolutionOne(int[] array) {
        Arrays.sort(array);
        int div = array.length / 2;
        System.out.println(div);
        return array[div];
    }

    private static int worstSolution(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i]) + 1);
            }else {
                map.put(array[i],1);
            }
        }
        int majority = 0;
        for (Integer i : map.keySet()){
            if(map.get(i) > majority)
                majority = i;
        }
        return array[majority];
    }
}
