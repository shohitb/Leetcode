public class Solution {
    public int maxProfit(int[] prices) {
       int min_profit = Integer.MAX_VALUE;
       int max_profit = 0;
       for(int i=0; i<prices.length-1; i++){
           min_profit = Math.min(min_profit, prices[i]);
           max_profit = Math.max(max_profit, prices[i+1] - min_profit);
       }
       return max_profit;
    }
}