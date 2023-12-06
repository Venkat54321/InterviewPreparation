package leetcode.array.medium;

public class ContainerWithMostWater {

    public static void main(String[] args) {
       // int[] array = {1,8,6,2,5,4,8,3,7};
        int[] array = {1, 2, 1};
        int result = mySolution(array);
        System.out.println(result);
    }

    private static int mySolution(int[] array) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = array.length - 1;
        while (i <= j){
            int min = Math.min(array[i],array[j]);
            int diff = j - i;
            int result = min * diff;
            if(result > max){
                max = result;
            }
            if(array[i] <= array[j]){
                i++;
            }else
                j--;
        }
        return max;
    }
}
