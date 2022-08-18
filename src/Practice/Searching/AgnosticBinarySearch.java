package Practice.Searching;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,7,8,10,12,16,19};
        int[] arr2 ={9,8,7,6,5,4,3,3,1};

        System.out.println(agnosticBinarySeach(arr, 19));
        System.out.println(agnosticBinarySeach(arr2, 1));
    }

    public static int agnosticBinarySeach(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscen = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(isAscen){
                if(arr[mid] < target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(arr[mid] < target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
