package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] array = {6,6,6,6};
        int res = mySolution(array);
        System.out.println(res);
    }

    private static int mySolution(int[] array) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(Integer i : array){
            set.add(i);
        }
        int maxSheCanEat = array.length / 2;
        return Math.min(maxSheCanEat,set.size());
    }
}
