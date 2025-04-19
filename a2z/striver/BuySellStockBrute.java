package a2z.striver;

public class BuySellStockBrute {
    public static void main(String[] args) {
        int arr [] = {7, 1, 5, 3, 6, 4};
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int currentProfit = 0;
            for(int j=i; j<arr.length; j++){
                currentProfit = arr[j] - arr[i];
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        System.out.println(maxProfit);
    }
}
