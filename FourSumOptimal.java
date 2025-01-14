import java.util.Arrays;

public class FourSumOptimal {
    // best it can get O(n log n + n^3)
    public static void main(String[] args) {
        int a [] = {1,0,-1,0,-2,2};
        int target = 0;
        int n = a.length;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                // Two pointer approach starts with p and q
                int p = j + 1, q = n - 1;
                while (p < q){
                    int sum = a[i] + a[j] + a[p] + a[q];
                    if(sum == target){
                        System.out.println("Found pair "+a[i]+", "+a[j]+", "+a[p]+", "+a[q]);
                        p++;
                        q--;
                    } else if(sum < target){
                        p++;
                    } else {
                        q--;
                    }
                }
            }
        }
    }
}
