package BinarySearch;


public class RotatedBinarySearch {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8,9,0,1,2};
        System.out.println(search(arr, 6));
    }
    public static int search(int[] arr, int key){
        int pivot = findPivot(arr);
        if(pivot == -1){
           return binarySearch(arr,key,0,arr.length-1);

        }
        if(key == arr[pivot]){
            return pivot;
        }

       if(key > arr[0]){
           return binarySearch(arr, key,0 ,pivot-1);
       }else{
          return binarySearch(arr,key, pivot+1, arr.length-1);
       }
    }
    public static int binarySearch(int arr[], int key,int start, int end){
          while(start <= end){
            int mid = start+ (end-start)/2;

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
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
