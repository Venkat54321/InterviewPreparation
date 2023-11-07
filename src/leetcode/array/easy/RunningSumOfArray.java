package leetcode.easy;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] array = {3,1,2,10,1};
        mySolution(array);
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));

    }

    private static void mySolution(int[] array) {
        int i = 1;
        while (i < array.length){
            array[i] = array[i] + array[i-1];
            i++;
        }
    }
}
