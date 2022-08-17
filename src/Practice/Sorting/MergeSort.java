package Practice.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 2,3,5,1,7,1,11,123,0,-1};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = start + (end-start)/2;
            mergeSort(arr, start, mid );
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int[] ans = new int[arr.length];
        int i =  start;
        int j = mid+1;
        int k = start;

        while(i<= mid && j<= end){
            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                k++;
                i++;
            }
            else{
                ans[k] = arr[j];
                j++;
                k++;
            }
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

        for(k=start; k<=end; k++){
            arr[k] = ans[k];
        }
    }
}
