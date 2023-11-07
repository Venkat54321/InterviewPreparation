package leetcode.easy;

import java.util.*;

public class BaseballGame {

    public static void main(String[] args) {
        String[] operations = {"5","-2","4","C","D","9","+","+"};
       // String[] operations = {"5","2","C","D","+"};
        Integer total = mySolution(operations);
        System.out.println(total);

    }

    private static Integer mySolution(String[] operations) {
        Integer sum = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0;i< operations.length;i++){
            switch (operations[i]){
                case "+" :
                    Integer previous = list.getLast();
                    Integer previousToPrevious = list.get(list.size() - 2);
                    list.addLast( previous + previousToPrevious);
                    break;
                case "C" :
                    list.removeLast();
                    break;
                case "D" :
                    Integer value = list.getLast();
                    list.addLast(2 * value);
                    break;
                default:
                    list.addLast(Integer.valueOf(operations[i]));
            }
        }
        for(int i = 0 ;i< list.size();i++){
            sum = sum + list.get(i);
        }
        return sum;
    }
}
