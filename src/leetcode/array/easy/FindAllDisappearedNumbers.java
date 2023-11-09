package leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDisappearedNumbers {

    public static void main(String[] args) {
        //int[] array = {4,3,2,7,8,2,3,1};
        int[] array = {1,1};
        List<Integer> result = mySolution(array);
        result.forEach(i -> System.out.print(i + " "));
    }

    private static List<Integer> mySolution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<array.length;i++){
            int index = Math.abs(array[i]) - 1;
            if(array[index] > 0){
                array[index] = array[index] * -1;
            }
        }
        for (int i =0;i<array.length;i++){
            if(array[i] > 0){
                list.add(i + 1);
            }
        }
         return list;
    }
}

