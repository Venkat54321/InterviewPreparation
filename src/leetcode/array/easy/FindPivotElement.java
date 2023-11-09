package leetcode.array.easy;

public class FindPivotElement {

    public static void main(String[] args) {
        int[] array = {-1,1,2};
        int index = findPivot(array);
        System.out.println(index);
    }

    private static int findPivot(int[] array) {
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            sum = sum + array[i];
        }
        int leftSum = 0;
        int rightSum = sum;
        for(int i = 0;i< array.length;i++){
            rightSum = rightSum - array[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum = leftSum + array[i];
        }
        return -1;
    }
}
