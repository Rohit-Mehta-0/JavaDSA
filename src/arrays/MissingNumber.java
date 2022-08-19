package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,0,1,4};
        System.out.println(find(arr));
    }

    static int find(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i];

            if(arr[i] < arr.length-1 && arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(i=0; i<arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
