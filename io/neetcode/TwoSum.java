package io.neetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int ans [] = twoSum(new int [] {3,4,5,6}, 7);
        System.out.println(ans[0]+" and "+ans[1]);
    }
    public static int [] twoSum(int nums [], int target){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(hmap.containsKey(diff)){
                return new int [] {hmap.get(diff), i};
            } else {
                hmap.put(nums[i], i);
            }
        }
        return null;
    }
}
