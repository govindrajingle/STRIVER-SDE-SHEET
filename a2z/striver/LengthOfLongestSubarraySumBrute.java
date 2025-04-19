package a2z.striver;

public class LengthOfLongestSubarraySumBrute {
    public static void main(String[] args) {
        int arr [] = {6, -2, 2, -8, 1, 7, 4, -10};
        int n = arr.length;
        int max = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum == 0) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println("Maximum length sub array = " + max);
    }
}
