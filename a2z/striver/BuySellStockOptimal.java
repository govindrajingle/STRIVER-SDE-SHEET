package a2z.striver;

public class BuySellStockOptimal {
    public static void main(String[] args) {
        int prices [] = {7, 1, 5, 3, 1, 4};
        int n = prices.length, bestBuy = Integer.MAX_VALUE, maxProfit = Integer.MIN_VALUE;
        // bestBuy is variable to find the day at we should buy the stock to get maximum profit
        for(int i=0; i<n; i++){
            bestBuy = Math.min(bestBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-bestBuy);
        }
        System.out.println(maxProfit);
    }
}
