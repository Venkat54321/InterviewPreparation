package leetcode.array.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] array1 = {4, 9, 5};
        int[] array2 = {9, 4, 9, 8, 4};
        int[] finalArray = mySolution(array1, array2);
        Arrays.stream(finalArray).forEach(i -> System.out.print(i + " "));
    }

    private static int[] mySolution(int[] array1, int[] array2) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : array1) {
            set.add(i);
        }
        for (int i : array2) {
            if (set.contains(i)) {
                list.add(i);
                set.remove(i);
            }
        }
        int[] resultArray = new int[list.size()];
        for(int i =0;i< list.size();i++){
            resultArray[i] = list.get(i);
        }

        return resultArray;

}
}
