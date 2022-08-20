package arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,2,2,1,0,1,2,2,1,0};
        dutchNationalflag(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void dutchNationalflag(int[] arr){
        int start = 0;
        int mid = 0;
        int end = arr.length-1;

        while(mid <= end){
            if(arr[mid] == 0){
                swap(arr, mid, start);
                start++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, end);
                end--;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
