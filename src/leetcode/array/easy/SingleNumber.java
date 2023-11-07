package leetcode.easy;

public class SingleNumber {

    public static void main(String[] args) {
        int[] array = {2,2,1};
        int singleNumber = mySolution(array);
//         int singleNumber = 0^5;
        System.out.println(singleNumber);
    }

    private static int mySolution(int[] array) {
        int number = 0;
        for(int i = 0;i<array.length;i++){
            number = number^array[i];
        }
        return number;
    }
}
