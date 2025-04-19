package a2z.striver;

import java.util.ArrayList;
import java.util.List;

public class PermutationRecursion{
    public static void main(String[] args) {
        int nums [] = {11, 22, 33, 44};
        List<List<Integer>> result = new ArrayList<>();
        permu(nums, 0, result);
        for(List<Integer> num : result){
            System.out.println(num);
        }
    }
    public static void permu(int nums[], int start, List<List<Integer>> result){
        if(start == nums.length){//base condition of recursion
            List<Integer> oneOption = new ArrayList<>();
            for(int num : nums){
                oneOption.add(num);
            }
            result.add(oneOption);
        } else {
            for(int i=start; i<nums.length; i++){
                swap(nums, start, i);
                permu(nums, start+1, result); //recursive condition
                swap(nums, start, i);
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}