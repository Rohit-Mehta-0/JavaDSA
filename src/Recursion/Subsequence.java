package Recursion;

public class Subsequence {
    public static void main(String[] args){
        subseq(" ","123");
    }

    public static void subseq(String pro, String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }

        char ch = unpro.charAt(0);

        subseq(pro + ch, unpro.substring(1));
        subseq(pro, unpro.substring(1));
    }

    public static void subseqIterative(){

    }
}
