class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // Buy day
        int maxProfit = 0;
        
        for (int right = 1; right < prices.length; right++) {
            // If current price is lower than buying price, slide left pointer
            if (prices[right] < prices[left]) {
                left = right;
            } else {
                // Calculate profit and update maxProfit if higher
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            }
        }
        return maxProfit;
    }
}
