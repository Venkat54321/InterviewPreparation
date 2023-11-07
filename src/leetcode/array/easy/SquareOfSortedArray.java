package leetcode.easy;

import java.util.Arrays;
import java.util.Map;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
public class SquareOfSortedArray {

    public static void main(String[] args) {
       // int[] array = {-7,-3,2,3,11};
        int[] array = {-4,-1,0,3,10};
        int[] newArray = mySolution(array);
        Arrays.stream(newArray).forEach(i -> System.out.print(i + " "));
    }

    private static int[] mySolution(int[] array) {
        int[] newArray = new int[array.length];
        int k = array.length - 1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int square = 0;
            if(Math.abs(array[left]) < Math.abs(array[right])){
                square = Math.abs(array[right]);
                right--;
            }else {
                square = Math.abs(array[left]);
                left++;
            }
            newArray[k] = square * square;
            k--;
        }

        return newArray;
    }
}
