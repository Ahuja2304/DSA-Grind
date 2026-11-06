class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int price = prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]<price){
                price = prices[i];
            }
            int currprofit = prices[i]-price;
            if(currprofit>maxprofit){
                maxprofit = currprofit;
            }
        }
        return maxprofit;
    }
}