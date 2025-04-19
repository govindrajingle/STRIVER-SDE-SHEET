package io.neetcode;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums [] = {3, 1, 4, 2};
        int n = nums.length;
        int[] ans = new int[n];
        int productBeforeCurrent = 1, productAfterCurrent = 1;
        for(int i=0; i<n; i++){
            ans[i] = productBeforeCurrent;
            productBeforeCurrent *= nums[i];
        }
        printArray(ans);
        for(int i=n-1; i>=0; i--){
            ans[i] *= productAfterCurrent; //tricky part
            productAfterCurrent *= nums[i];
        }
        printArray(ans);
    }
    public static void printArray(int ans []){
        for(int i : ans){
            System.out.print(i+", ");
        }
        System.out.println();
    }
}
