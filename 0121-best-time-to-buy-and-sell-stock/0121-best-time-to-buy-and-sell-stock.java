class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int max =prices[prices.length-1];

        for(int i=prices.length-1;i>=0;i--){

            diff = Math.max(diff,max-prices[i]);

            if(prices[i]>max){
                max = prices[i];
            }
        }

        return diff;
        
    }
}