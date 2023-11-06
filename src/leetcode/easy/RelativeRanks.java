package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        String[] newArray = mySolution(array);
        for (String i : newArray){
            System.out.print(i + " ");
        }
    }

    private static String[] mySolution(int[] array) {
        if(array.length == 1){
            return new String[]{"Gold Medal"};
        }
        Map<Integer,String> map = new HashMap<>();
        String[] strArray = new String[array.length];
        int[] newArray = IntStream.of(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt( i -> i)
                .toArray();

        for(int i =0;i<newArray.length;i++){
            if(i == 0){
                map.put(newArray[0],"Gold Medal");
            }else if(i == 1){
                map.put(newArray[1],"Silver Medal");
            }else if(i == 2){
                map.put(newArray[2],"Bronze Medal");
            }else {
                map.put(newArray[i], String.valueOf(i + 1));
            }
        }
        for(int j=0;j<array.length;j++){
            strArray[j] = map.get(array[j]);
        }
        return strArray;
    }
}
