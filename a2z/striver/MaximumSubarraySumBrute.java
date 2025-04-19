package a2z.striver;

public class MaximumSubarraySumBrute {
    public static void main(String[] args) {
        int arr[] = {1, -2, -3, 4};
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println(maxSum);
    }
}
