package Recursion;

import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args){
        int[] arr = {};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(check(arr));
        System.out.println(checkWithRecursion(arr, 0));
    }
    public static boolean check(int[] arr){
      for(int i=0; i<arr.length-1; i++){
          if(arr[i] > arr[i+1]){
              return false;
          }
      }
      return true;
    }
    public static boolean checkWithRecursion(int[] arr, int i){
        if(arr.length == 1 || arr.length ==0){
            return true;
        }
        if(i == arr.length-2){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return checkWithRecursion(arr,i+1);
    }
}
