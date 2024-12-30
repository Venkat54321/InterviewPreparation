package leetcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MeetingRooms {
    public static void main(String[] args) {
        int[][] array = {{0,30},{5,10},{15,20}};
        // {0,30},{5,10},{15,20}
        //{{5,8},{6,8}};
        //{{7,10},{2,4}};
       /* boolean meeting = isMeeting(array);
        System.out.println(meeting);*/
        Integer minMeeting = minMeetingI(array);
        System.out.println(minMeeting);
    }

    private static Integer minMeetingI(int[][] array) {
        if(array.length == 0){
            return 0;
        }
        int count = 1;
        Arrays.sort( array,Comparator.comparing(o -> o[0]));
        int rows = array.length - 1;
        int column = array[0].length - 1;
        int i = 1;
        int m = 0;
        while (i <= rows && m <= column){
            int e1 = array[i][0];
            int e2 = array[m][1];
            if(e1 <= e2){
                count++;
            }
            i++;
            m++;
        }
        return count;
    }

    private static boolean isMeeting(int[][] array) {
        if(array.length == 0){
            return true;
        }
        Arrays.sort( array,Comparator.comparing(o -> o[0]));
        int rows = array.length - 1;
        int column = array[0].length - 1;
        int i = 1;
        int m = 0;
        while (i <= rows && m <= column){
            int e1 = array[i][0];
            int e2 = array[m][1];
            if(e1 <= e2){
                return false;
            }
            i++;
            m++;
        }
        return true;
    }
}
