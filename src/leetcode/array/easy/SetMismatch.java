package leetcode.easy;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
         int[] array = {1,2,2,4};
       //int[] array = {3,3};
        int[] newArray = mySolution(array);
        Arrays.stream(newArray).forEach(i -> System.out.print(i + " "));
    }

    private static int[] mySolution(int[] nums) {
        int[] array = new int[nums.length];
        for(int i : nums){
            array[i-1]++;
        }
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println("");
        return new int[]{1};
    }
}
