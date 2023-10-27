package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    public static void main(String[] args) {
       // int[] array = {4,12,5,3,1,2,5,3,1,2,4,6};
       // int[] array = {13,7,6,12,10};
        int[] array = {2,4};
        int[] array2 = {1,2,3,4};
        int[] newArray =  bestSolution(array,array2);
        Arrays.stream(newArray).forEach(i -> System.out.print(i + " "));
    }

    private static int[] bestSolution(int[] array1, int[] array2) {
        int n = array2.length;
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        stack.push(array2[array2.length -1]);
        map.put(array2[array2.length - 1],-1);

        for(int i = n -2 ;i>=0;i-- ){

            if(stack.peek() > array2[i]){
                map.put(array2[i],stack.peek());
                stack.push(array2[i]);
                continue;
            }
            while (!stack.isEmpty() && stack.peek() < array2[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(array2[i],-1);
                stack.push(array2[i]);
            }else {
                map.put(array2[i],stack.peek());
                stack.push(array2[i]);
            }
        }
        for(int i=0;i<array1.length;i++){
            array1[i] = map.get(array1[i]);
        }
        return array1;
    }
}
