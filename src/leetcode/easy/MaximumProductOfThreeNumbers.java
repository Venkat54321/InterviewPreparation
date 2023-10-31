package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;

public class MaximumProductOfThreeNumbers {

    public static void main(String[] args) {
        Integer[] array = {-1,-2,-3};
        int maximum = getMaximumProduct(array);
        System.out.println(maximum);
    }

    private static int getMaximumProduct(Integer[] array) {
        Arrays.sort(array);
        int n = array.length;
        return Math.max(array[n-1] * array[n-2] * array[n-3], array[0] * array[1]* array[n-1]);
    }
}
