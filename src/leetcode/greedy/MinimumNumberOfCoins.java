package leetcode.greedy;

public class MinimumNumberOfCoins {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int value = 49;
        int minCoins = findMinCoins(array,value);
        System.out.println(minCoins);
    }

    private static int findMinCoins(int[] array, int value) {
        if(value == 0){
            return 0;
        }
        int min = 0;
        for(int i = array.length - 1; i >=0;i--){
            if(array[i] > value){
                continue;
            }else if(array[i] <= value) {
                value = value - array[i];
                min++;
            }
        }

        return min;
    }
}
