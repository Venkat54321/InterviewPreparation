package leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Heap {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        int k = 2;
        int[] array = {3,2,1,5,6,4};
        for(int i = 0;i < array.length - 1; i++){
            if(queue.size() < k){
                queue.add(array[i]);
            }else if(array[i] > queue.peek()){
                queue.poll();
                queue.add(array[i]);
            }
        }
        System.out.println(queue.peek());
    }
}
