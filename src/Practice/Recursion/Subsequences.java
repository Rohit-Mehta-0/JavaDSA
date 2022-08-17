package Practice.Recursion;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();

        printSubs(arr, list, 0);

    }

    public static void printSubs(int[] arr, ArrayList<Integer> list, int index){
        if(index >= arr.length){
            System.out.println(list);
            return;
        }
        printSubs(arr, list, index+1);

        list.add(arr[index]);

        printSubs(arr, list, index+1);

        list.remove(list.size()-1);


    }
}
