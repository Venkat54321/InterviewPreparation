package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HowManySmallerThenCurrentElement {

    public static void main(String[] args) {
        Integer[] array = {7,7,7,7};
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println(" ");
        Map<Integer,Integer> map = mySolution(array);
        Integer[] newArray = new Integer[array.length];
        for(int i = 0;i < array.length;i++){
            newArray[i] = map.get(array[i]);
        }
        Arrays.stream(newArray).forEach(i -> System.out.print(i + " "));
    }

    private static Map<Integer,Integer> mySolution(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        Map<Integer,Integer> map =  new HashMap<>();
        int n = array.length;
        int i = n-2;
        Integer[] newArray = new Integer[array.length];
        newArray[n-1] = 0;
        map.put(array[n-1],0);
        while (i >= 0){
            if(array[i] == array[i+1]){
                newArray[i] = newArray[i+1];
                map.put(array[i],newArray[i+1]);
            }else {
                newArray[i] = newArray[i+1] + 1;
                map.put(array[i],newArray[i+1] + 1);
            }
            i--;
        }
        System.out.println(map);
        return map;

    }
}
