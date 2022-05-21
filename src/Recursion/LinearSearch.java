package Recursion;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {};
        System.out.println(search(arr, 89));
    }
    public static int search(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }
        else{
            return linearSearch(arr, arr.length-1, key);
        }
    }
    public static int linearSearch(int[] arr, int length, int key){
        if(length == 0) return -1;
        if(arr[length] == key) return length;
        return linearSearch(arr, length-1,key);
    }
}

