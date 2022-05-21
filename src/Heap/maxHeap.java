package Heap;

import java.util.ArrayList;
import java.util.Arrays;

public class maxHeap {
    public static void main(String[] args) {
        int arr[] ={9,8,6,5,2,1,0,0,0,0};
        insertInMaxHeap(arr,12, 6);
        System.out.println(Arrays.toString(arr));
        delete(arr,7);
        System.out.println(Arrays.toString(arr));
        delete(arr,6);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertInMaxHeap(int[] arr, int value, int n){
        int i = n;
        arr[n] = value;
        while(i > 0){
            int parent = (i-1)/2;

            if(arr[parent] < arr[i]){
                int temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;

                i = parent;
            }
            else return;
        }
    }

    public static void delete(int[] arr, int n){
        arr[0] = arr[n-1];
        n = n-1;
        int i=0;

        while(i<n){
            int l = 2*i +1;
            int r = 2*i +2;
            int large = i;
            if(l < n && arr[l] > arr[r]){
                large = 2*i+1;
            }
            if(r < n && arr[l] < arr[r]){
                large = 2*i+2;
            }
            if(arr[i] < arr[large]){
                int temp = arr[i];
                arr[i] = arr[large];
                arr[large] = temp;
            }else{
                return;
            }

        }
    }


}
