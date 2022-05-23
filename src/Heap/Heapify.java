package Heap;

import java.util.Arrays;

//max heap
public class Heapify {
    public static void main(String[] args) {
        int arr[] = {54,53,55,52,50};
        int n = arr.length-1;
        for(int i=(n/2)-1; i>=0; i--){
            heapify(arr, n, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void heapify(int[] arr, int   length, int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<length && arr[largest] < arr[l]){
            largest = l;
        }

        if(r<length && arr[largest] < arr[r]){
            largest = r;
        }

        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, length, largest);
        }
    }
}
