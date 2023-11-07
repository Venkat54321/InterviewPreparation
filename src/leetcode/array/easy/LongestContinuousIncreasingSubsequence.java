package leetcode.easy;

public class LongestContinuousIncreasingSubsequence {

    public static void main(String[] args) {
        int[] array = {2,4,6,5,8};
        int longest = mySolution(array);
        System.out.println(longest);
    }

    private static int mySolution(int[] array) {
        int res = 1;
        int max = 1;
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return 1;
        }
        for(int i = 1;i< array.length;i++){
            if(array[i-1] < array[i]){
                res = res + 1;
            }else
                res = 1;
            max = Math.max(res,max);
        }
        return max;
    }
}
