package Recursion;

import java.util.ArrayList;

//https://leetcode.com/problems/combination-sum/
public class CombinationalSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        ArrayList<Integer> list = new ArrayList<>();

        print(candidates, target, list, 0);
    }

    public static void print(int[] arr, int target, ArrayList<Integer> list, int index){
        if(index == arr.length){
            if(target == 0){
                System.out.println(list);
            }
            return;
        }

        if(arr[index] <= target){
            list.add(arr[index]);

            print(arr, target-arr[index], list, index);

            list.remove(list.size()-1);

        }

        print(arr, target, list, index+1);
    }
}
