package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/missing-ranges/description/
 */
public class MissingRanges {

    public static void main(String[] args) {
        //int[] nums = {0,1,3,50,75};
        //int[] nums = { -1};
        int[] nums = {1,3};
        int lower = 0;
        int upper = 9;
       // List<List<Integer>> finalList = worstSolution(nums,lower,upper);
        List<List<Integer>> finalList = bestSolution(nums,lower,upper);

        System.out.println(finalList);
    }

    private static List<List<Integer>> bestSolution(int[] nums, int lower, int upper) {
        int length = nums.length;
        List<List<Integer>>  list = new ArrayList<>();

        if(length == 0){
            list.add(Arrays.asList(lower,upper));
            return list;
        }
        if(lower < nums[0]){
            list.add(Arrays.asList(lower,nums[0] - 1));
        }
        for(int i = 0;i< length-1;i++){
            if(nums[i+ 1] - nums[i] <= 1){
               continue;
            }
            list.add(Arrays.asList(nums[i] + 1,nums[i + 1] - 1));
        }
        if(nums[length - 1] < upper){
            list.add(Arrays.asList(nums[length - 1] + 1,upper));
        }
        return list;
    }

    private static List<List<Integer>> worstSolution(int[] nums, int lower, int upper) {
        int length = nums.length;
        List<List<Integer>>  list = new ArrayList<>();
        int i = 0;
        int j = i+1;
        while (length > 0){
            List<Integer> newList = new ArrayList<>();
            if(nums[i] == lower){
                //newList.add(n)
            }


            length--;
        }

        return list;
    }
}
