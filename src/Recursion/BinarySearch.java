package Recursion;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,5,32,8,3,89,3,5,77};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Implementation(arr, 32));
    }

    public static int Implementation(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        return search(arr, key, start, end);
    }

    public static int search(int[] arr, int key, int start, int end){
        int mid = start +(end-start)/2;
        if(start > end){
            return -1;
        }

        if(arr[mid] < key){
            search(arr, key, mid+1, end);
        }
        else if(arr[mid] > key){
            search(arr,key,start,mid-1);
        }
        else if(arr[mid] == key){
            return mid;
        }
        return -1;
    }

}

