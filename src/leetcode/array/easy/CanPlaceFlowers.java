package leetcode.array.easy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] array = {1,0,0,0,1};
        int n = 1;
        boolean canPlaceFlower = mySolution(array,n);
        System.out.println(canPlaceFlower);
    }

    private static boolean mySolution(int[] array, int n) {
        int count = 0;
        for(int i = 0;i< array.length;i++){
            if(array[i] == 0){
                boolean isLeftZero = (i == 0 || array[i-1] ==0);
                boolean isRightZero = (i == array.length - 1 || array[i + 1]==0);
                if(isLeftZero && isRightZero){
                    n--;
                    array[i] = 1;
                }
            }
        }
        return n <= 0;
    }
}
