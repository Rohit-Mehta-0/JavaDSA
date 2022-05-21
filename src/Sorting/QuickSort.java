package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={4,5,2,3,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    private static void sort(int[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            sort(arr, start, pivot-1);
            sort(arr, pivot+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int i = start;
        int j = end;
        int pivot = arr[start];

        while(i < j){
            while(arr[i] <= pivot && i<end) i++;
            while(arr[j] > pivot && j>start) j--;

            if(i<j){
                swap(arr,i,j);
            }
        }

        swap(arr,j,start);
        return j;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
