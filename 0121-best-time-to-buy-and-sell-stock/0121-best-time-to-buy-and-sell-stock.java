class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int e=prices[n-1];
        int dif=0;
        for(int i=prices.length-1;i>=0;i--){
             dif=Math.max(dif,max-prices[i]);
              //max=Math.max(max,max-prices[i]);
              if(max<prices[i]){
                max=prices[i];
              }
        }
        return dif;
    }
}