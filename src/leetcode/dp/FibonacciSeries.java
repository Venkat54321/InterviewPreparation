package leetcode.dp;

public class FibonacciSeries {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int index = 20;

        int value = fibonacciNumber(index);
        System.out.println(value);
    }

    private static int fibonacciNumber(int i) {
        if(i <= 1){
            return i;
        }
        return fibonacciNumber(i - 1) + fibonacciNumber(i -2);
    }
}
