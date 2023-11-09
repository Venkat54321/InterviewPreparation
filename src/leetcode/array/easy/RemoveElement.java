package leetcode.array.easy;

/**
 * https://leetcode.com/problems/remove-element/description/
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] array  = {0,1,2,2,3,0,4,2};
        //int[] array = {3,3};
        int val = 2;
        int k = mySolution(array,val);
        System.out.println(k);
    }

    private static int mySolution(int[] array, int val) {

        int slow = 0;
        for(int fast = 0;fast < array.length;fast++){
            if(array[fast] != val){
                array[slow++] = array[fast];
            }
        }
        System.out.println(slow);
        return slow;
    }

}
