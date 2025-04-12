package io.neetcode;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        ArrayList<Integer> ans =  topKFrequent(new int[] {1,1,1,2,2,3}, 2);
        int result [] = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static ArrayList<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //(indexValue, Occurrences)
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                 map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        //System.out.println(map.toString());
        ArrayList<Integer> temp = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= k){
                temp.add(entry.getKey());
            }
        }
        //System.out.println(temp);
        return temp;
    }
}
