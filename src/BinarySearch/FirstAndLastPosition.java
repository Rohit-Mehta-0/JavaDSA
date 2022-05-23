package BinarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] ans = searchRange(nums, 8);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {

        int ans[] = {-1, -1};

        ans[0] = search(nums, target, 0);
        if(ans[0] != -1){
            ans[1] = search(nums, target, 1);
        }
        return ans;
    }
    public static int search(int[] arr, int target, int check){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                if(mid > start && arr[mid] == arr[mid-1] && check == 0){
                    end = mid-1;
                }
                else if(mid < end && arr[mid] == arr[mid+1] && check ==1){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}