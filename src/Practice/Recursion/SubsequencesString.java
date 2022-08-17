package Practice.Recursion;

import java.util.ArrayList;

public class SubsequencesString {
    public static void main(String[] args) {
        String s = "roh";
        ArrayList<Character> list = new ArrayList<>();
        printSub(s, list, 0);
    }
    public static void printSub(String s, ArrayList<Character> list, int index){
        if(index >= s.length()){
            System.out.println(list);
            return;
        }

        list.add(s.charAt(index));
        printSub(s,list,index+1);
        list.remove(list.size()-1);
        printSub(s,list,index+1);
    }
}
