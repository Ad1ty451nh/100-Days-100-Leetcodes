class Solution {
    public int maxProfit(int[] prices) {
      int buyPrice = prices[0];
      int maxProfit = 0;

      for(int j = 1;j<prices.length;j++){
        if (prices[j]<buyPrice){
            buyPrice = prices[j];
        } else{
            maxProfit= Math.max(maxProfit,prices[j]-buyPrice);
        }
      }
      return maxProfit;
    }
}
