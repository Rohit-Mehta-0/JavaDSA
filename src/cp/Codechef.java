package cp;
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--> 0){
            int n = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                arr2[i] = sc.nextInt();
            }
            int count = 0;

            for(int i=0; i<n-1; i++){
                for(int j=n-1; j>i; j--){
                    if(arr1[i] == arr2[j] && arr1[j] == arr2[i]){
                        count++;
                    }
                }
            }
            int i=0, j= n-1;


            System.out.println(count);

        }

        sc.close();
    }
}