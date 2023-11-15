package leetcode.array.medium;

public class Power {
    public static void main(String[] args) {
        double n = 2.00000;
        int x = -2;
        double result = pow(n,Math.abs(x));
        if(x < 0){
            System.out.println(1 / result);
        }else {
            System.out.println(result);
        }
    }

    private static double pow(double n, int x) {
        if(x == 0){
            return 1;
        }
        return n * pow(n,x-1);
    }
}
