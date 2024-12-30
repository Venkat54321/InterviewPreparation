package leetcode.binarysearch.medium;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int peakElementIndexR = findPeakElementIndexInRight(array);
        int peakElementIndexL = findPeakElementIndexInLeft(array);
        int index = Math.max(peakElementIndexL, peakElementIndexR);
        System.out.println(array[index]);
    }

    private static int findPeakElementIndexInLeft(int[] array) {
        if(array.length == 1){
            return 0;
        }
        int index = 0;
        if(array.length == 2){
            if(array[0] > array[1]){
                return 0;
            }else{
                return 1;
            }
        }
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(array[mid] >= array[mid -1] && array[mid] >= array[mid + 1]){
                index = Math.max(mid,index);
            }
            end  = mid - 1;
        }
        return index;
    }

    private static int findPeakElementIndexInRight(int[] array) {
        if(array.length == 1){
            return 0;
        }
        int index = 0;
        if(array.length == 2){
            if(array[0] > array[1]){
                return 0;
            }else{
                return 1;
            }
        }
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(array[mid] >= array[mid -1] && array[mid] >= array[mid + 1]){
                index = Math.max(mid,index);
            }
                start = mid + 1;
        }
        return index;
    }
}
