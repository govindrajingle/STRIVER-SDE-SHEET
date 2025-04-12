package io.neetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        boolean ans = hasDuplicate(new int[]{1, 2, 3, 3});
        System.out.println(ans);
    }
    public static boolean hasDuplicate(int nums []){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                return true;
            }
            map.put(i, 1);
        }
        return false;
    }
}
