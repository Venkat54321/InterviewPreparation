package leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public static void main(String[] args) {
        //int[] array = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,9};
        int[] array = {9};
        //int[] worstSolution = WrostSolutionPlusOne(array);
        int[] bestSolution = bestSolution(array);
        Arrays.stream(bestSolution).forEach(i -> System.out.print(i + " "));


    }

    private static int[] bestSolution(int[] array) {
        int length = array.length;
        for(int i = length - 1; i >=0;i--){
            if(array[i] < 9){
                array[i]++;
                return array;
            }
            array[i] = 0;
        }
        int[] newArray = new int[length + 1];
        newArray[0] = 1;
        return newArray;
    }

    private static int[] WrostSolutionPlusOne(int[] array) {
        StringBuilder sb = new StringBuilder();
        int length = array.length;
        for(int i = 0;i <= length - 1;i++){
            sb.append(array[i]);
        }
        Long strToInt = Long.parseLong(sb.toString());
        Long finalSum = strToInt + 1;
        int finalSumLength = String.valueOf(finalSum).length();
        int[] newArray = new int[finalSumLength];
        int newArrayLen = newArray.length - 1;
        Long div = finalSum;
        while (newArrayLen >= 0){
            long rem = div % 10;
            div = div / 10;
            newArray[newArrayLen] = (int)rem;
            newArrayLen--;
        }
        Arrays.stream(newArray).forEach(i -> System.out.print(i + "  "));
        return newArray;
    }
}
