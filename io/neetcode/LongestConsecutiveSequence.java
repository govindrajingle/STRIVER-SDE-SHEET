package io.neetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int nums[] = {1, 5, 2, 4, 4, 8, 3};
        int n = nums.length;
        int ans = bruteForce(nums, n);
        System.out.println(ans);
    }

    public static int bruteForce(int[] nums, int n) {
        if (n == 0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + count)) {
                    count++;
                }
                longest = Math.max(longest, count);
                if (longest > n / 2) {
                    return longest;
                }
            }
        }
        return longest;
    }
}
