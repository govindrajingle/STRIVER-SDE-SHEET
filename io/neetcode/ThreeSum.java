package io.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int nums[]) {
        if (nums.length < 3) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                final int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[i++], nums[r--]));
                    while (l < r && nums[l] == nums[l - 1]) {
                        ++l;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        --r;
                    }
                } else if (sum < 0) {
                    ++l;
                } else {
                    --r;
                }
            }
        }
        return ans;
    }
}
