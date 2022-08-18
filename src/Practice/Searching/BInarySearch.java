package Practice.Searching;

public class BInarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,12,153};
        System.out.println(search(arr, 15));
    }
    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
