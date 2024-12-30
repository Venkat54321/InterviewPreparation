package leetcode.greedy;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        Arrays.sort(arr);
        Arrays.sort(dep);
        int minimuNumOfTrain = mySolution(arr,dep);
        System.out.println(minimuNumOfTrain);
    }

    private static int mySolution(int[] start, int[] end) {
        int j = 0;
        int i =1;
        int numOfPlatform = 1;
        int max = 1;
        while(i < start.length && j < start.length){
            if(start[i] <= end[j]){
                numOfPlatform++;
                i++;
            }else if(start[i] > end[j]) {
                numOfPlatform--;
                j++;
            }
            if(numOfPlatform > max){
                max = numOfPlatform;
            }
        }
        return max;
    }
}
