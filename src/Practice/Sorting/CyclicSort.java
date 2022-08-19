package Practice.Sorting;

public class CyclicSort {
    public static void main(String[] args) {

    }
    public static void cycleSort(int[] arr){
       int i=0;
       while(i<arr.length){
           int correctIndex = arr[i]-1;
           if(arr[i] != arr[correctIndex]){
               swap(arr, i, correctIndex);
           }
           else{
               i++;
           }
       }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
