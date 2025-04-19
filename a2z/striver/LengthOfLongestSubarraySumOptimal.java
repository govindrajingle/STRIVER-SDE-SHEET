package a2z.striver;

import java.util.HashMap;

public class LengthOfLongestSubarraySumOptimal {
    public static void main(String[] args) {
        int arr [] = {6, -2, 2, -8, 1, 7, 4, -10};
        //           {0,  1, 2,  3, 4, 5, 6,  7}
        int n = arr.length;
        int max = 0, sum = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum == 0){
                max = i + 1;
            } else {
                if(hmap.get(sum) == null){
                    hmap.put(sum, i);
                } else {
                    max = Math.max(max, i - hmap.get(sum));
                }
            }
        }
        System.out.println("Length = " + max);
    }
}
