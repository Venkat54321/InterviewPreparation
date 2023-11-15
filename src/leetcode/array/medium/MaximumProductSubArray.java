package leetcode.array.medium;

import java.util.Map;

public class MaximumProductSubArray {

    public static void main(String[] args) {
        int[] array = {-3,-1,-1};
      //  int result = mySolution(array);
        int result = bestSolution(array);
        System.out.println(result);

    }

    private static int bestSolution(int[] array) {
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i = 0;i<array.length;i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            prefix = prefix * array[i];
            suffix = suffix * array[array.length - i - 1];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }

    private static int mySolution(int[] array) {
        if(array.length == 1){
            return array[0];
        }
        int max = Integer.MIN_VALUE;
        int product = 1;
        for(int i = 0;i< array.length;i++){
            product = product * array[i];
            if(product > max){
                max = product;
            }
            if(product == 0){
                product = 1;
            }
        }
        return max;
    }
}
