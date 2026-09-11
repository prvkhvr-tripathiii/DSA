class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] > bestBuy)
            {
                maxProfit = maxProfit > prices[i]-bestBuy? maxProfit: prices[i]-bestBuy;  
            }
            bestBuy = bestBuy < prices[i]? bestBuy: prices[i];
        }
        return maxProfit;
    }
}