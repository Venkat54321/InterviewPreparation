package leetcode.easy;

public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] array = {5,4,-1,7,8};
        int max = mySolution(array);
        System.out.println(max);
    }

    private static int mySolution(int[] array) {

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        for(int i = 0;i<array.length;i++){
            if(sum == 0){
                start = i;
            }
            sum = sum + array[i];
            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }

        }
        for(int k = ansStart; k <= ansEnd;k++){
            System.out.print(array[k] + " ");
        }
        System.out.println(" ");
        return max;
    }
}
