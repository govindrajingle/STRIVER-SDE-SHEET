package a2z.striver;

import java.util.* ;

public class InversionArrayOptimal {
    public static void main(String[] args) {
        long arr [] = {2, 5, 1, 3, 4};
        System.out.println("total number of pairs are " + getInversions(arr, arr.length));
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long count = numberOfInversions(arr, n);
        return count;
    }
    static long numberOfInversions(long a[], int n){
        return mergeSort(a, 0, n-1);
    }
    static long mergeSort(long a[], int low, int high){
        long count = 0;
        if(low >= high) {
            return count;
        }
        int mid = (low + high) / 2;
        count += mergeSort(a, low, mid);
        count += mergeSort(a, mid+1, high);
        count += merge(a, low, mid, high);
        return count;
    }
    static long merge(long a[], int low, int mid, int high){
        ArrayList<Long> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        long count = 0;
        while(left <= mid && right <= high){
            if(a[left] <= a[right]){
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                count += mid - left + 1;
                right++;
            }
        }
        while(left <= mid){
            temp.add(a[left]);
            left++;
        }
        while(right <= high){
            temp.add(a[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            a[i] = temp.get(i-low);
        }
        return count;
    }
}
