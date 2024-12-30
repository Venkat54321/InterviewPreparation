package leetcode.binarysearch.easy;

public class ImplementLowerBound {
    public static void main(String[] args) {
        int[] array = {3,5,8,15,19};
        int x = 9;
        int indexPosition = mySolution(array,x);
        System.out.println(indexPosition);
    }

    private static int mySolution(int[] array, int x) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start +  (end - start) / 2;
            if(array[mid] >= x){
                return mid;
            }else if(array[mid] < x){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
