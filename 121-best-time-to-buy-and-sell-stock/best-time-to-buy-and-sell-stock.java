class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int Profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy ,prices[i]);
            Profit=Math.max(Profit,prices[i]-buy);
        }
        return Profit;
    }
}