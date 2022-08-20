package arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr ={5,4,-1,7,8};
        System.out.println(KadanesAlgo(arr));
    }

    static int KadanesAlgo(int[] arr){
        int currentSum = arr[0];
        int overallSum = arr[0];


        for(int i=1; i<arr.length; i++){
            if(currentSum > 0){
                currentSum+=arr[i];
            }
            else if(currentSum <=0){
                currentSum = arr[i];
            }

            if(overallSum < currentSum){
                overallSum = currentSum;
            }
        }

        return overallSum;
    }
}
