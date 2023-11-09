package leetcode.array.easy;

public class CheckIsMajorElement {

    public static void main(String[] args) {
       // int[] nums = {2,4,5,5,5,5,5,6,6};
      //  int[] nums = {10,100,101,101};
        int[] nums = {1,2,2,3};
        int target = 2;
        boolean isMajor  = isMajor(nums,target);
        System.out.println(isMajor);
    }

    private static boolean isMajor(int[] nums, int target) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        int index = nums.length;
        while (start <= end){
            mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
                index = mid;
            }else{
                start = mid + 1;
            }
        }
        boolean isMajor = index + nums.length / 2 < nums.length &&  nums[index + (nums.length / 2)] == target;
        return isMajor;
    }
}
