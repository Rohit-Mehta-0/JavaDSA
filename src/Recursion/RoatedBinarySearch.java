package Recursion;

public class RoatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,0,1,2,3};
        System.out.println(search(arr, 3,0,arr.length-1));
    }

    public static int search(int[] arr, int key, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid] == key){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(key<= arr[mid] && key > arr[start]){
                return search(arr, key, start, mid-1);
            }
            return search(arr, key, mid+1, end);
        }
        if(key >= arr[mid] && key <= arr[end]){
            return search(arr, key,mid+1, end);
        }
        return search(arr, key, start, mid-1);
    }
}
