package io.neetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int ans[] = twoSumOther(new int[]{3, 4, 5, 6}, 7);
        System.out.println(ans[0] + " and " + ans[1]);
    }

    public static int[] twoSum(int nums[], int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hmap.containsKey(diff)) {
                return new int[]{hmap.get(diff), i};
            } else {
                hmap.put(nums[i], i);
            }
        }
        return null;
    }

    public static int[] twoSumOther(int numbers[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (map.containsKey(diff)) {
                // Add the index of the element that completes the sum
                temp.add(map.get(diff));  // The index of the first number
                temp.add(i);              // The index of the second number
                break;  // Return early as we found the answer
            } else {
                map.put(numbers[i], i);  // Add the current element and its index to the map
            }
        }
        // Convert ArrayList to int array and return
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }

}
