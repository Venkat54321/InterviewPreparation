package leetcode.matrix.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralFormMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list = mySolution(matrix);
        System.out.println(list);

    }

    private static List<Integer> mySolution(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        System.out.println(rowEnd + " " + colEnd);
        while (rowBegin <= rowEnd && colBegin <= colEnd){
            // first row
            for(int i = colBegin;i<=colEnd;i++){
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i = rowBegin;i <= rowEnd;i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    list.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }
            if(colBegin<=colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    list.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }

        return list;
    }
}
