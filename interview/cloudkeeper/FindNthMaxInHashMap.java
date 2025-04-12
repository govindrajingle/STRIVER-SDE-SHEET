package interview.cloudkeeper;

import java.util.*;

public class FindNthMaxInHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 45);
        map.put("Bob", 41);
        map.put("Charlie", 50);
        map.put("Denice", 40);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        //Find the second-largest marks
        int arr[] = new int[map.size()]; //Create an array to store the hashmap values
        Collection<Integer> values = map.values(); // map.values return the Collection and that can be iterated via the For each and Iterator
        int i = 0, n = arr.length;
        for (Integer num : values) {// Use for each for classes looping
            arr[i] = num;
            i++;
        }
        //Now find the nth largest in given array {45, 41, 50, 40}
        int k = 2;
        //O(nlog)
        //Arrays.sort(arr);
        //System.out.println("Nth largest is using merge sort " + arr[arr.length - k]);
        //Yes we can find in O(N) use quickSelect approach and use MinHeap as it does job in O(M log N) M for iteration and log N for insertion
//        for (int j = 0; j < n; j++) {
//            for (int l = j; l < n; l++) {
//                if (arr[j] > arr[l]) {
//                    int temp = arr[j];
//                    arr[j] = arr[l];
//                    arr[l] = temp;
//                }
//            }
//        }
        int ans = quickSelect(arr, 0, n-1, n-k);
        System.out.println(ans);
    }
    public static int quickSelect(int nums[], int left, int right, int k){
       if(nums[left] == nums[right]){
           return nums[left];
       }

       int pivotIndex = left + (right - left) / 2;
       pivotIndex = partition(nums, left, right, pivotIndex);
       if(k == pivotIndex){
           return nums[k];
       } else if(k < pivotIndex){
           return quickSelect(nums, left, pivotIndex-1, k);
       } else {
           return quickSelect(nums, pivotIndex+1, right, k);
       }
    }
    public static int partition(int[] nums, int left, int right, int pivotIndex){
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, right);
        int storeIndex = left;
        for(int j=left; j<right; j++){
            if(nums[j] < pivot){
                swap(nums, storeIndex, j);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }
    public static void swap(int [] nums, int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}



















