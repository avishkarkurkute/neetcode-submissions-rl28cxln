class Solution {
    public int maxProfit(int[] prices) {
        int minElement = prices[0];
        int maxProfit = 0;
        for(int i = 0;i < prices.length;i++){
            if(prices[i] < minElement){
                minElement = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minElement);
        }
        return maxProfit;
    }
}