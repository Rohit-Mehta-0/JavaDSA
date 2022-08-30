package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,8,9,0,1,2,3};
        System.out.println(binarySearch(arr));
    }

    public static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;


            if(arr[mid] > arr[start]){
                start =  mid+1;
            }
            else{
                end = mid-1;
            }


        }
        return end;
    }
}
