package leetcode.array.medium;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        int firstMin = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int val: array){
            if(val <= firstMin){
                firstMin = val;
            }else if(val <= secMin){
                secMin = val;
            }else {
                System.out.println("found");
            }
        }

    }
}
