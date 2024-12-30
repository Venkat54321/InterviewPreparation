package leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnitsOfBox {

    public static void main(String[] args) {
        /*int[][] array = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;*/

        int[][] array = {{2,1},{4,4},{3,1},{4,1},{2,4},{3,4},{1,3},{4,3},{5,3},{5,3}};
        int truckSize = 13;

       /* int[][] array = {{1,3},{2,2},{3,1}};
        int truckSize = 4;*/

        int totalNumberOfUnits = getTotalNumOfUnits(array,truckSize);
        System.out.println(totalNumberOfUnits);

    }

    private static int getTotalNumOfUnits(int[][] array, int truckSize) {
        if(truckSize == 0){
            return 0;
        }
        Arrays.sort(array, (o1, o2) -> Integer.valueOf(o2[1]).compareTo(Integer.valueOf(o1[1])));
        int count = 0;
        for(int i = 0; i< array.length;i++){
           int min = Math.min(truckSize,array[i][0]);
           count = count + min * array[i][1];
           truckSize = truckSize - min;
           if(truckSize == 0){
               break;
           }
        }
       return  count;
    }
}
