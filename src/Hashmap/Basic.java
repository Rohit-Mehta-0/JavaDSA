package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India" , 135);
        hm.put("China" , 200);
        hm.put("UK",40);
        hm.put("USA", 60);

        System.out.println(hm);

        hm.put("India", 140);

        System.out.println(hm);

        Set<String> set = hm.keySet();
        System.out.println(set);
    }
}
