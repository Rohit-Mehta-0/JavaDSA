package Practice.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2,3,5,1,7,1,11,123,0,-1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int mini = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[mini] > arr[j]){
                   mini = j;
                }

            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

}
