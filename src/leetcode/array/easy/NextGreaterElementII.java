package leetcode.array.easy;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {

    public static void main(String[] args) {
       // int[] array = {4,12,5,3,1,2,5,3,1,2,4,6};
        int[] array = {1,2,1};
        int[] newArray =  bestSolution(array);
        Arrays.stream(newArray).forEach(i -> System.out.print(i + " "));
    }

    private static int[] bestSolution(int[] array) {
        int n = array.length;
        int[] newArray = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1;i>=0;i--){
            if(stack.empty()) {
                stack.push(array[i]);
                newArray[i] = -1;
                continue;
            }
            if(stack.peek() > array[i]){
                newArray[i] = stack.peek();
                stack.push(array[i]);
                continue;
            }
            while (!stack.isEmpty() && stack.peek() < array[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                newArray[i] = -1;
                stack.add(array[i]);
            }else {
                newArray[i] = stack.peek();
                stack.add(array[i]);
            }
        }
        return newArray;
    }
}
