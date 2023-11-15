package leetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> list = mySolution(n);
        System.out.println(list);
    }

    public static List<List<Integer>> mySolution(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        list.add(myList);
        for(int i=1;i<n;i++) {
            List<Integer> innerList = new ArrayList<>(i+ 1);
            innerList.add(0,1);
            List<Integer> previuosList = list.get(i - 1);
            for (int j = 0; j < previuosList.size() - 1; j++) {
                innerList.add( previuosList.get(j)+ previuosList.get(j+1));
            }
            innerList.add(innerList.size(),1);
            list.add(innerList);
        }
        return list;
    }
}
