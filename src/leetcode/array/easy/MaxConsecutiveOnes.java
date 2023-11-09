package leetcode.array.easy;

/**\
 * https://leetcode.com/problems/max-consecutive-ones/description/
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
      //  int[] array = {1,1,0,1,1,1};
        int[] array = {1,0,1,1,0,1};
        int max = maxConsecutive(array);
        System.out.println(max);

    }

    private static int maxConsecutive(int[] array) {
        int max = 0;
        int sum = 0;
        for(int i =0;i<array.length;i++){
            if(array[i] == 1){
                sum++;
            } else {
                max = Math.max(sum,max);
                sum = 0;
            }
        }
        return Math.max(sum,max);
    }
}
