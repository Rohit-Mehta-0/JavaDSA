package Recursion;

public class SumOfArray {
    public static void main(String[] args){
        int[] arr = {1,5};
        System.out.println(sum(arr, arr.length-1, 0));
    }
    public static int sum(int[] arr, int length, int sum){
        if(length < 0){
            return sum;
        }
        return sum(arr, length-1, sum+=arr[length]);
    }
}
