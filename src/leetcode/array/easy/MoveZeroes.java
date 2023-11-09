package leetcode.array.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/move-zeroes/description/
 */
public class MoveZeroes {

    public static void main(String[] args) {
        //int[] array = {0,1,0,3,12};
        //int[] array = {0};
        int[] array = {23, 9, 6, 4, 0, 0, 21, 7, 0, 6, 0, 9};
        int[] movedZerosArray = worstSolution(array);
        Arrays.stream(movedZerosArray).forEach(i -> System.out.print(i + " "));
    }

    private static int[] worstSolution(int[] array) {

        int length = array.length;
        int i = 0;
        int j = 0;
        if(array.length == 1){
            return array;
        }
        while (i < length &&  j < length){
            if(array[j] != 0){
                swap(array,i,j);
                i = i + 1;
            }
            j++;
        }
        return array;
    }

    private static void swap(int[] array, int i, int i1) {
        int temp = array[i];
        array[i] = array[i1];
        array[i1] = temp;
    }
}
