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
            System.out.print(result[i]+" ");
        }
    }

    private static ArrayList<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //indexValue and frequency
        int  n = nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }
        ArrayList<Integer> temp = new ArrayList<>();
        while(temp.size() < k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            temp.add(entry.getKey());
        }
        return temp;
    }
}
