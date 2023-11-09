package leetcode.array.easy;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
       // List<Integer> list = mySolution(array,target);
        int[] list = bestSolution(array,target);
        Arrays.stream(list).forEach(i -> System.out.print(i + " "));
    }

    private static int[] bestSolution(int[] array, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<array.length;i++){
            int minus = target - array[i];
            if(map.containsKey(minus)){
                return new int[] {map.get(minus),i};
            }
            map.put(array[i],i);
        }
        return null;
    }

    private static List<Integer> mySolution(int[] array, int target) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< array.length;i++){
            map.put(array[i],i);
        }
        for(Integer i : map.keySet()){
            int res = target - i;
            if(map.containsKey(res)){
                list.add(map.get(i));
                list.add(map.get(res));
                return list;
            }
        }

        return list;
    }
}
