package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
            int[] arr = {124,6,3,36,7,3,22,278,35};
            sort(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end){

        if(start < end){
            int pivot = partition(arr,start,end);
            sort(arr, start, pivot-1);
            sort(arr, pivot+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int i= start;
        int j = end;
        while(i<j){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[start];
        arr[start] = temp;

        return j;

    }


}
