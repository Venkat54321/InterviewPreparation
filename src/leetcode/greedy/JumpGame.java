package leetcode.greedy;

public class JumpGame {
    public static void main(String[] args) {
       // int[] array = {1,1,2,5,2,1,0,0,1,3};
        int[] array = {3,2,1,0,4};
        boolean canJump = jumpGame(array);
        System.out.println(canJump);
    }

    private static boolean jumpGame(int[] array) {
        int finalTarget = array.length - 1;

        for(int i = array.length - 1; i>=0;i--){
            if(i + array[i] >= finalTarget){
                finalTarget = i;
            }
        }
        return finalTarget == 0;
    }
}
