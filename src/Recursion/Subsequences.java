package Recursion;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        int[] arr = {1,2,3};
        printSubs(arr, list, 0);
    }

    public static void printSubs(int[] arr, ArrayList<Integer> list , int index){
        if(index == arr.length){
            System.out.println(list);
            return;
        }

        list.add(arr[index]);

        printSubs(arr, list, index+1);

        list.remove(list.size()-1);

        printSubs(arr, list, index+1);
    }
}
