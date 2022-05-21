package Hashmap;

import java.util.HashMap;

public class HighestFrequencyCharacter {
    public static void main(String[] args){
        String str = "Rohit";
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of+1;
                hm.put(ch, nf);
            }
            else{
                hm.put(ch,1);
            }
        }
        char ans = str.charAt(0);

        for(Character ch : hm.keySet()){
            if(hm.get(ch) > hm.get(ans)){
                ans = ch;
            }
        }
        System.out.println(ans+" "+hm.get(ans));
    }

}