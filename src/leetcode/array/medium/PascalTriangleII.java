package leetcode.array.medium;

import java.util.List;

public class PascalTriangleII {

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = PascalTriangle.mySolution(n);
        List<Integer> result = list.get(n-1);
        System.out.println(result);
    }
}
