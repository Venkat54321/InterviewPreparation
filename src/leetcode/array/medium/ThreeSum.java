package leetcode.array.medium;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] array = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = mySolution(array);
        System.out.println(list);
    }

    private static List<List<Integer>> mySolution(int[] array) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(array);
        for(int i = 0;i< array.length - 2;i++){
            int j = i + 1;
            int k = array.length - 1;
            while (j < k){
                int sum = array[i] + array[j] + array[k];
                if( sum == 0){

                    set.add(Arrays.asList(array[i],array[j],array[k]));
                    j++;
                    k--;
                }else if(sum < 0){
                    j++;
                }else k--;
           }
        }
        list.addAll(set);
        return list;
    }
}
