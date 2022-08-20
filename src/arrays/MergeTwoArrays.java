package arrays;

import java.util.ArrayList;
import java.util.Arrays;

//merge two array in sorted way without extra space
public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,10};
        int[] arr2 = {2,3,9};

        merge(arr, arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
    public static void merge(int[] arr, int[] arr2){
        int j;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr2[0]){
                swap(arr, arr2, i );
            }

            int first = arr2[0];

            for(j=1; j<arr2.length && arr2[j] < first; j++){
                arr2[j-1] = arr2[j];
            }
            arr2[j-1]  = first;
        }
    }
    public static void swap(int[] arr, int[] arr2, int first){
        int temp = arr[first];
        arr[first] = arr2[0];
        arr2[0] = temp;
    }



}
