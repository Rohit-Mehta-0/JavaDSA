package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,6};
        int arr2[] = {3, 4, 5, 6, 6, 7};

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i:arr){
            set.add(i);
        }
        int count = 0;
        for(int i:arr2){
            if(set.contains(i)){
                list.add(i);
                count++;
                set.remove(i);
            }
        }
        System.out.println(list);
    }
}
