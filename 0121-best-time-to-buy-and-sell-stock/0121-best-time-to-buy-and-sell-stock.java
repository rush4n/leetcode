class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                continue;
            }
            maxProfit = Math.max(maxProfit, prices[i] - buy);
        } 

        return maxProfit;
    } 
}