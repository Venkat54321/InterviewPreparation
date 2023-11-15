package leetcode.array.medium;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] array = {3,4,6,1,2};
       // int[] output = bestSolution(array);
        int[] output = bestSolutionII(array);
        for (int i : output){
            System.out.println(i);
        }
    }

    private static int[] bestSolutionII(int[] array) {
        int[] result = new int[array.length];
        result[0] = 1;
        for(int i = 1;i<array.length;i++){
            result[i] = result[i-1] * array[i-1];
        }
        int R = 1;
        for(int i = array.length - 1;i>=0;i--){
            result[i] = result[i] * R;
            R = R * array[i];
        }
        return result;
    }

    private static int[] bestSolution(int[] array) {
        if(array.length == 0){
            return array;
        }
        //left
        int[] left = new int[array.length];
        left[0] = 1;
        for (int i = 1;i < array.length;i++){
            left[i] = left[i-1] * array[i-1];
        }
        //right
        int[] right = new int[array.length];
        right[array.length - 1] = 1;
        for(int i = array.length - 2;i>=0;i--){
            right[i] = right[i + 1 ] * array[i + 1];
        }
        //result
        int[] result = new int[array.length];
        for(int i = 0;i<array.length;i++){
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
