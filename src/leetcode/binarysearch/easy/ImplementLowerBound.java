package leetcode.binarysearch.easy;

public class ImplementLowerBound {
    public static void main(String[] args) {
        int[] array = {3,5,8,15,19};
        int x = 19;
        int indexPosition = mySolution(array,x);
        System.out.println(indexPosition);
    }

    private static int mySolution(int[] array, int x) {
        int i = 0;
        int j = array.length - 1;
        while (i <= j){
            int mid = (i + j) / 2;
            if(array[mid] == x){
                return mid;
            }else if(array[mid] < x){
                i = mid + 1;
            }else {
                j = mid - 1;
            }
        }
        return -1;
    }
}
