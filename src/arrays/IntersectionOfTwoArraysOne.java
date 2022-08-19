package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArraysOne {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,2,1};
        int[] arr2 = {2,2,};

        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }

    static int[] intersection(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();


        int i=0, j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] == arr2[j]){
                set.add(arr1[i]);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        int[] ans = new int[set.size()];
        int k=0;
        for(Integer val : set){
            ans[k++] = val;
        }
        return ans;
    }

}
