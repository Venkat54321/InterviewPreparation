package leetcode.easy;

/**
 * https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber {

    public static void main(String[] args) {
       // int[] array = {9,6,4,2,3,5,7,0,1};
        int[] array = {0,1};
        //int missingNumber = mySolution(array);
        int missingNumber = leetcodeSolution(array);
        System.out.println(missingNumber);
    }

    private static int leetcodeSolution(int[] nums) {
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }

    private static int mySolution(int[] array) {
        int sum = 0;
        int max = 0;
        for(int i =0;i<array.length;i++){
            sum = sum + array[i];
            if(array[i] > max){
                max = array[i];
            }
        }
        int allSum = max * (max + 1) / 2;
        return allSum - sum;
    }
}
