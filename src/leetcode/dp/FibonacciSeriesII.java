package leetcode.dp;

public class FibonacciSeriesII {
    public static void main(String[] args) {
        int index = 7;
        int[] array = new int[index];
        array[0] = 0;
        array[1] = 1;
        int fibonacciNumber = getFibonacciNumber(array);
        System.out.println(fibonacciNumber);

    }

    private static int getFibonacciNumber(int[] array) {
       for(int i = 2;i <= array.length - 1;i++){
           array[i] = array[i-1] + array[i-2];
       }
       return array[array.length - 1];
    }
}
