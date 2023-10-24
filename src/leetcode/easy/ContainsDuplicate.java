package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        boolean isDuplicated = isDuplicate(array);
        System.out.println(isDuplicated);
    }

    private static boolean isDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < array.length ;i++){
            if(set.contains(array[i])){
                return true;
            }else {
                set.add(array[i]);
            }
        }
        return false;
    }
}
