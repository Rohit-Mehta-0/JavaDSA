package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
       System.out.println(kthLargestElement(arr, 8));
    }

    static int kthLargestElement(int[] arr, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr){
            queue.add(i);
        }

        while(k-- > 1){
            queue.poll();
        }
        return queue.peek();
    }
}
