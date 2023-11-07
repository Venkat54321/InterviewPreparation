package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {

    public static void main(String[] args) {
        String[] array1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        String[] array2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] newArray = mySolution(array1,array2);
        for (String s: newArray){
            System.out.println(s);
        }
    }

    private static String[] mySolution(String[] array1, String[] array2) {
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i< array2.length;i++){
            map.put(array2[i],i);
        }
        int min_Index = Integer.MAX_VALUE;
        for(int i = 0 ;i<array1.length;i++){
            if(map.containsKey(array1[i])){
                int index_sum = i + map.get(array1[i]);
                if(index_sum < min_Index){
                    list.clear();
                    min_Index = index_sum;
                    list.add(array1[i]);
                }else if(min_Index == index_sum){
                    list.add(array1[i]);
                }

            }
        }
       return list.toArray(new String[0]);
    }
}
