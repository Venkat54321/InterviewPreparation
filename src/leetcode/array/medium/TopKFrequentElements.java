package leetcode.array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] array = {2,2};
        int k = 1;
        //int[] result = mySolution(array,k);
        int[] result = bestSolution(array,k);
        for (int i:result){
            System.out.println(i);
        }
    }

    private static int[] bestSolution(int[] array, int k) {
        if(array.length == 0){
            return array;
        }
        if(array.length == 2 && k == 2){
            return array;
        }
        if(array.length == 1){
            return array;
        }
        List<Integer>[] bucket = new List[array.length + 1];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : array){
            if(map.containsKey(i)){
                Integer value = map.get(i);
                map.put(i,value + 1);
            }else {
                map.put(i,1);
            }
        }
        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();;
            }
            bucket[frequency].add(key);
        }
        int[] res = new int[k];
        int count = 0;
        for(int i = bucket.length - 1;i >= 0 && count < k;i--){
            if(bucket[i]  != null){
               for(Integer integer : bucket[i]){
                  res[count++] = integer;
               }

            }
        }
        return res;
    }

    private static int[] mySolution(int[] array,int k) {
        if(array.length == 0){
            return new int[]{};
        }
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : array){
            if(map.containsKey(i)){
                Integer value = map.get(i);
                map.put(i,value + 1);
            }else {
                map.put(i,1);
            }
        }
        for(Integer i : map.keySet()){
            if(map.get(i) >= k){
                list.add(i);
            }
        }
        int[] array1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            array1[i] = list.get(i);
        return array1;
    }
}
