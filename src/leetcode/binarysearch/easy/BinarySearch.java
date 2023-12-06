package leetcode.binarysearch.easy;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {3,5,8,15,19};
        int x = 19;
        int i = 0;
        int j = array.length - 1;
        while (i <= j){
            int mid = (i + j) / 2;
            if(array[mid] == x){
                System.out.println(mid);
            }else if(array[mid] < x){
                i = mid + 1;
            }else {
                j = mid - 1;
            }
        }
    }
}
