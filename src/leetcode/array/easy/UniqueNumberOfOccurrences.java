package leetcode.array.easy;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        int[] array = {-3,0,1,-3,1,1,1,-3,10,0};
       // boolean unique = mySolution(array);
        boolean unique = bestSolution(array);
        System.out.println(unique);

    }

    private static boolean bestSolution(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i]) + 1);
            }else
                map.put(array[i],0);
        }
        Set<Integer> keys = map.keySet();
        Set<Integer> value = new HashSet<>(map.values());
        return keys.size() == value.size();
    }

    private static boolean mySolution(int[] array) {
        Arrays.sort(array);
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = array.length - 1;i > 0;i--){
            if(array[i] != array[i-1]){
                if(set.contains(sum)){
                    return false;
                }else {
                    set.add(sum);
                    sum = 0;
                }
            }else {
                sum++;
            }
        }
        return true;
    }
}
