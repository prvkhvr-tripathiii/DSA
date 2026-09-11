class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length == 1) {
            return 0;
        }

        int profit = 0;
        int maxProfit = 0;
        int bestBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (bestBuy < prices[i]) {
                profit = prices[i] - bestBuy;
                maxProfit += profit;
                bestBuy = prices[i];
            }
            else {
                bestBuy = bestBuy < prices[i] ? bestBuy : prices[i];
            }
        }
        return maxProfit;
    }
}