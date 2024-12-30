package leetcode.array.medium;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2};
        int k = 3;
        rotateArray2(array,k);
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void rotateArray1(int[] array, int k) {
        while (k > 0) {
            int currentElement = array[0];
            int lastElement = array[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                int tmp = array[i + 1];
                array[i + 1] = currentElement;
                currentElement = tmp;
            }
            array[0] = lastElement;
            for(int i : array){
                System.out.print(i + " ");
            }
            k--;
            System.out.println(" ");
        }
    }

    private static void rotateArray2(int[] array, int k){
        k = k % array.length;
        if(k < 0){
            k = k + array.length;
        }
        reverse1(array,0,array.length - k - 1);
        reverse1(array, array.length - k , array.length - 1);
        reverse1(array,0,array.length - 1);
    }

    private static void reverse1(int[] array, int i, int j) {
        while (i < j){
            int tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            i++;
            j--;
        }
    }
}
