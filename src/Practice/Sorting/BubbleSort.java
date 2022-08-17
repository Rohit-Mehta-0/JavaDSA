package Practice.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {1,6,2,8,29,03,21};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        boolean swapped = false;
        for(int i=0; i<arr.length; i++){
            for(int j=0 ; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }

            }
            if(swapped){
                return;
            }
        }
    }
}
