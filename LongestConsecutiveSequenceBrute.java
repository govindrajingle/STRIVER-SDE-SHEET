import java.util.Arrays;

public class LongestConsecutiveSequenceBrute {
    public static void main(String[] args) {
        int arr [] = {1, 2, 0, 1};
        int n = arr.length, maxCount = Integer.MIN_VALUE;
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] - arr[i-1] == 1 ){
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println("maximum longest consecutive sequence is " + maxCount);
    }
}
