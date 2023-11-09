package leetcode.array.easy;

import java.util.Arrays;

public class ArrayPartition {

    public static void main(String[] args) {
        int[] array = {1,4,3,2};
        int maxSum = mySolution(array);
        System.out.println(maxSum);
    }

    private static int mySolution(int[] array) {
        Arrays.sort(array);
        int max = 0;
        for(int i = 1;i< array.length;i = i+2){
            int min = Math.min(array[i],array[i-1]);
            max = max + min;
        }
        return max;
    }
}
