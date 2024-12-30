package leetcode.binarysearch.medium;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] array = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        boolean isFound = isFound(array,target);
        System.out.println(isFound);
    }

    private static boolean isFound(int[][] array, int target) {
        for(int i = 0; i<= array.length - 1;i++){
            for(int j = 0;j<= array[0].length - 1;j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
