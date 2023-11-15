package leetcode.matrix.easy;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
      //  int[][] ans = mySolution(matrix);
        // in place work only for square matrix
        int[][] ans = inPlaceSolution(matrix);
        for(int i =0;i<ans.length;i++){
            for(int j =0;j<ans[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
        }
    }

    public static int[][] inPlaceSolution(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        return matrix;
    }

    /**
     *
     * int R = A.length, C = A[0].length;
     *         int[][] ans = new int[C][R];
     *         for (int r = 0; r < R; ++r)
     *             for (int c = 0; c < C; ++c) {
     *                 ans[c][r] = A[r][c];
     *             }
     *         return ans;
     *     }
     * @param matrix
     * @return
     */
    private static int[][] mySolution(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];
        for(int i =0;i< row;i++){
            for(int j =0 ;j< col;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }


}
