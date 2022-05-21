package BinarySearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,5,32,8,3,89,3,5,77};
       System.out.println(Implementation(arr, 77));

    }

    public static int Implementation(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = (start+(end-start/2));

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
