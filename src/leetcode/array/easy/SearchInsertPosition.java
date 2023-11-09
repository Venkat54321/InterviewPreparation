package leetcode.array.easy;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        int target = 2;
        int index = mySolution(array,target);
        System.out.println(index);
    }

    private static int mySolution(int[] array,int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(array[mid] == target)
                return mid;
            if(array[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}
