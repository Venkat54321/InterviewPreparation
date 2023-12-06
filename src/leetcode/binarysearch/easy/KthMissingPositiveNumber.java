package leetcode.binarysearch.easy;

public class KthMissingPositiveNumber {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int k = 2;
        int position= mySolution(array,k);
        System.out.println(position);
    }

    private static int mySolution(int[] array, int k) {
        int[] newArray = new int[k];
        int counter = 0;
        int i = 0;
        int start = 1;
        while (counter < k && i < array.length){
            if(array[i] != start){
                newArray[counter++] = start;
            }else {
                i++;
            }
            start++;
        }
        while (counter < k){
            newArray[counter++] = start;
            start++;
        }
        return newArray[k-1];
    }
}
