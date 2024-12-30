package leetcode.binarysearch.medium;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4};
        Arrays.sort(array);
        int duplicateNumber = getDuplicateNumber(array,0,array.length - 1);
        System.out.println(duplicateNumber);
    }

    private static int getDuplicateNumber(int[] array, int start, int end) {
        while (start < end){
            int mid = start + (end - start) / 2;
            if(array[mid] == array[mid - 1] || array[mid] == array[mid + 1]){
                return array[mid];
            }else if (array[mid] < array[mid - 1]){
               return getDuplicateNumber(array,start,mid - 1);
            }else{
                return getDuplicateNumber(array,mid + 1, end);
            }
        }
        return -1;
    }
}
