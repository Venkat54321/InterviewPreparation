package leetcode.array.easy;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
       // int[] array = {1,1,2};
        int k = mySolution(array);
       // System.out.println(k);

    }

    private static int mySolution(int[] array) {

        int i = 0;
        int n = array.length;
        int j = 1;
        if(n == 1){
            return 1;
        }
        while (j <= n -1 ) {
            if (j != i && array[i] != array[j]) {
                array[i + 1] = array[j];
                i++;
            }
            j++;
        }
        /*for(int k = 0; k < i + 1;k++ ){
            System.out.print(array[k] + " ");
        }*/
        return i + 1;
    }
}
