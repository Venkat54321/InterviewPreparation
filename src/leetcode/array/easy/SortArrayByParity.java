package leetcode.array.easy;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] array = {0,2};
        int[] newArray = mySolution(array);
        Arrays.stream(newArray).forEach(i -> System.out.print(i + " "));
    }

    private static int[] mySolution(int[] array) {
        if(array.length == 1){
            return array;
        }
        int i = 0;
        while (i < array.length && isEven(array[i])){
            i++;
        }
        int j = i + 1;
        while (j < array.length){
            if(isEven(array[j])) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
            j++;
        }
        return array;
    }

    private static boolean isEven(int number){
        return number % 2 == 0;
    }
}
