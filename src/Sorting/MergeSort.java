package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={3,352,6,26,2,78,5,894,2,0};
        split(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void split(int[] arr, int start, int end){
        if(start < end){
            int mid = start + (end - start)/2;
            split(arr, start, mid);
            split(arr,mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int k = start;

        int[] ans = new int[arr.length];

        while(i<= mid && j<= end){
            if(arr[i] <= arr[j]){
                ans[k] = arr[i];
                i++;
            }
            else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i>mid){
            while(j<=end){
                ans[k] = arr[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                ans[k] = arr[i];
                i++;
                k++;
            }
        }

        for(k = start; k<= end; k++){
            arr[k] = ans[k];
        }
    }
}
