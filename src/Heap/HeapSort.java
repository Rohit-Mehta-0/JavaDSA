package Heap;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {166,6,3,2,62,28,1,};
        for(int i =arr.length-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i-1,0);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void heapify(int[] arr, int length, int i){
        int l = 2*i+1;
        int r = 2*i+2;
        int large = i;

        if(l  < length && arr[l] < arr[r]){
            large = r;
        }
        if(r < length && arr[l] > arr[r]) {
            large = l;
        }
        if(large != i){
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;

            heapify(arr, length, large);
        }
    }

}
