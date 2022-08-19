package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrayTwo {
    public static void main(String[] args) {
        int[] arr = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr, arr2)));
    }

    static int[] intersection(int[] arr, int[] arr2){
        Arrays.sort(arr);
        Arrays.sort(arr2);

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j=0;

        while(i < arr.length && j < arr2.length){
            if(arr[i] == arr2[j]){
                list.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int ans[] = new int[list.size()];
        i=0;
        for(Integer val : list){
            ans[i++] = val;
        }
        return ans;
    }
}
