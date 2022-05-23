package BinarySearch;

public class sqrt {

    public static void main(String[] args){
        int n= 10000;
        if(n == 0){
            System.out.println(0);
            return;
        }
        int start = 0;
        int end = n;

        while(start < end){
            int mid = start + (end-start)/2;

            if(mid <= n/mid && (mid+1) > n/(mid+1)){
                System.out.println(mid);
                return;
            }
            else if(mid > n/mid){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        System.out.println(start);
    }
}
