package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GetCommonElement1 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,5};
        int arr2[] ={1,1,1,2,2,4,5};
//        hashset(arr,arr2);
        hashmap(arr,arr2);

    }

    public static void hashmap(int[] arr, int[] arr2){
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                int of =  hm.get(arr[i]);
                int nf = of+1;
                hm.put(arr[i], nf);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        for(int i=0; i<arr2.length; i++){
            if(hm.containsKey(arr2[i]) && hm.get(arr2[i]) > 0){
                list.add(arr2[i]);
                int of = hm.get(arr2[i]);
                int nf = of-1;
                hm.put(arr2[i], nf);
            }
        }

        System.out.println(list);
    }

    public static void hashset(int[] arr, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                list.add(arr2[i]);
            }
        }
        System.out.println(list);
    }
}
