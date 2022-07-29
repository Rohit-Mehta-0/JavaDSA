package cp;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Codechef {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr1[] = new int[n];
       int arr2[] = new int[n];
       for(int i=0; i<n; i++){
           arr1[i] = sc.nextInt();
       }
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements from array1
        for (int i : arr1) {
            set1.add(i);
        }

        // Adding elements from array2
        for (int i : arr2) {
            set2.add(i);
        }

        int i = 0;
        for (int x : set1)
            arr1[i++] = x;

        for(i=0; i<set1.size(); i++){
            for(int j=i; j<set1.size(); j++){
                for (int k=i; k<=j; k++) {
                    System.out.print(arr1[k] + " ");
                }
                System.out.println();
            }

        }

    }
    

}