package leetcode.array.medium;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInArray {
    public static void main(String[] args) {
        //int[] array = {5,7,7,8,8,10};
        int[] array = {0,0,1,1,2,3,5,5,5,5,5,5,5,5,7,7};
        int target = 5;
        int left = searchInLeft(array,target);
        int right = searchInRight(array,target);
        System.out.println(Arrays.toString(new int[]{left, right}));
    }

    private static int searchInLeft(int[] array,int target) {
        int index = -1;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(array[mid] == target){
                index = mid;
                end = mid -1;
            }
            else if( array[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return index;
    }

    private static int searchInRight(int[] array,int target) {
        int index = -1;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(array[mid] == target){
                index = mid;
                start = mid + 1;
            }
            else if( array[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return index;
    }
}
