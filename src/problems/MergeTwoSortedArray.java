package problems;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] array1 = { 1, 3, 4, 5};
        int[] array2 = {2, 4, 6, 8,9,20};

        int[] array3 = new int[array1.length + array2.length];

        int i =0,j=0,k=0;
        while (i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                array3[k] = array1[i];
                i++;
            }
            else{
                array3[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < array1.length){
            array3[k] = array1[i];
            i++;
            k++;
        }
        while (j< array2.length){
            array3[k] = array2[j];
            j++;
            k++;
        }

        for (int i1 : array3) {
            System.out.println(i1);
        }


    }
}
