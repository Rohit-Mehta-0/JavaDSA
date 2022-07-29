package Recursion;

public class nNaturalNumbers {
    public static void main(String[] args) {
        print(0, 12);
    }

    public static void print(int i, int n){
        if(i > n){
            return;
        }
        System.out.print(i+" ");
        print(i+1, n);
    }
}
