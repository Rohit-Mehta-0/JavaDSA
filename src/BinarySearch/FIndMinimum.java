package BinarySearch;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FIndMinimum {
    public static void main(String[] args) {
//        int[] arr= {4,5,6,7,0,1,2};
        int[] arr ={11,13,15,17};
        int pivot = search(arr);

        if(pivot == -1){
            System.out.println(arr[0]);
            return;
        }
        System.out.println(arr[pivot]);
    }

    public static int search(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(start < mid && arr[mid] < arr[mid-1]){
                return mid;
            }
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid+1;
            }

            if(arr[start] >= arr[mid]){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
