package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,6,7};

        Set<Integer> set = new HashSet<>();

        for(int i: arr){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }

        System.out.println(set);

    }
}
