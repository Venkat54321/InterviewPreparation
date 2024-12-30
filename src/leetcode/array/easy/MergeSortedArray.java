package leetcode.array.easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] array1 = {2,0};
        int[] array2 = {1};
        int m = 1;
        int n = 1;
        //int[] array1 = {2,0};
       // int m = 1;
        //int[] array2 = {1};
        //int n = 1;
        mergeSortedArray(array1,m,array2,n);
        Arrays.stream(array1).forEach(i -> System.out.print(i + " "));
    }

    private static void mergeSortedArray(int[] array1, int m, int[] array2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = array1.length - 1;
        if(m == 0 && n == 1){
            array1[m] = array2[n - 1];
            return;
        }
        if(m == 1 && n == 0){
            return;
        }
        while (i >= 0 && j >= 0){
            if(array1[i] < array2[j]){
                array1[k] = array2[j];
                j--;
            }else if(array1[i] > array2[j]) {
                array1[k] = array1[i];
                i--;
            }
            k--;
        }
    }
}
