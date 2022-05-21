package Heap;

import java.util.Arrays;

public class minHeap {
    public static void main(String[] args) {
        int arr[] ={10,15,30,40,50,100,0,0,0};
        insertInMinHeap(arr,-120, 5);
        System.out.println(Arrays.toString(arr));
        delete(arr,7);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertInMinHeap(int[] arr, int value, int n){
        int i = n+1;
        arr[n+1] = value;
        while(i > 0){
            int parent = (i-1)/2;

            if(arr[parent] > arr[i]){
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
        int i = 0;
        int small = i;

        while(i<n){
            int l = 2*i+1;
            int r = 2*i+2;
            if(l<n && arr[l] < arr[r]){
                small = l;
            }
            if(r<n && arr[r] < arr[l]){
                small = r;
            }

            if(arr[i] > arr[small]){
                int temp = arr[i];
                arr[i] = arr[small];
                arr[small] = temp;
            }
            else{
                return;
            }
        }
    }

}
