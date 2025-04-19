package a2z.striver;

public class Sort012DutchNationalFlag {
    public static void main(String[] args) {
        int arr [] = {1, 0, 2, 1, 0, 2};
        //The final array would be sorted where 0 are from 0 to low-1, 1 are from low to mid-1 and 2 are from high+1 to n-1
        //The part from mid to high is where the array is unsorted, and we have to fix that till mid == high
        int low = 0, high = arr.length-1, mid = 0; //that's why at start mid is 0
        while(mid <= high){
            if(arr[mid] == 0){
                swap(low, mid, arr);
                low++;
                mid++;
            } else if (arr[mid] == 1){
                mid++;
            } else {
                swap(mid, high, arr);
                high--;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
