package leetcode.matrix.medium;

import static leetcode.matrix.easy.TransposeMatrix.inPlaceSolution;

public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //  int[][] ans = mySolution(matrix);
        // in place work only for square matrix
        int[][] ans = inPlaceSolution(matrix);
        int[][] ans1 = rotateArray(ans);
         for(int i =0;i<ans1.length;i++){
            for(int j =0;j<ans1[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
        }
    }

    private static int[][] rotateArray(int[][] ans) {
        for(int i=0;i<ans.length;i++){

        }
        return new int[][]{};
    }
}
